package control;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Callback;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;

public class MainController {
	 @FXML private Button addButton = new Button();       
     @FXML private DatePicker datePicker = new DatePicker();
	 @FXML private TextField descriptionTextField = new TextField();         
	 @FXML private ListView<task> taskListView = new ListView<>();
	 @FXML private StackPane newsStackPane = new StackPane();	
	 @FXML private StackPane callStackPane = new StackPane();	
	 @FXML private callList callList = new callList();
     @FXML private feedList feedList = new feedList();
	 @FXML private taskList taskList = new taskList();
     @FXML private CheckBox busyCheckBox = new CheckBox();

     
   @FXML private void initialize() throws InterruptedException, IOException {
		System.out.println("Application started");
		this.datePicker.setValue(LocalDate.now());  
		loadNews();
		loadTasks();
		loadCalls();
	 //	busyButton();
	}
   

    
	private void loadTasks() throws IOException{
	    	taskListView.setItems(this.taskList.getObservableList());
	        taskListView.setCellFactory(new Callback<ListView<task>, ListCell<task>>(){
	             public ListCell<task> call(ListView<task> p) {
	                 ListCell<task> cell = new ListCell<task>(){
	                     protected void updateItem(task t, boolean bln) {
	                         super.updateItem(t, bln);
	                         if (t != null) {
	                             setText("Description:\n" + t.getText() +  "\nDate: " + t.getDayOfMonth()+ "/" + t.getMonth() + "/" + t.getYear());
	                         }
	                     }
	                 }; 
	                 return cell;
	             }
	         });
	    }
	
	private void loadCalls() throws IOException {
		this.callList.readFile();
		this.callStackPane.getChildren().add(this.callList.getListView());
	}
	
	 private void loadNews() {
			newsStackPane.getChildren().add(feedList.generateObservableNews());
		}

	@FXML private void newTaskButton(Event e) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"/view/addTask.fxml"));
	   AnchorPane taskLayout;
	   taskLayout = loader.load();
	   Stage stage = new Stage();
	   Scene scene = new Scene(taskLayout);
	   stage.setScene(scene);
	   stage.showAndWait();
	}
	
	@FXML private void editTaskButton(Event e) throws IOException {
		this.descriptionTextField.setText(this.taskListView.getSelectionModel().getSelectedItem().getText());
		this.datePicker.setValue(LocalDate.of(this.taskListView.getSelectionModel().getSelectedItem().getYear(),
				this.taskListView.getSelectionModel().getSelectedItem().getMonth(), 
				this.taskListView.getSelectionModel().getSelectedItem().getDayOfMonth()));
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"/view/editTask.fxml"));
	   AnchorPane taskLayout;
	   taskLayout = loader.load();
	   Stage stage = new Stage();
	   Scene scene = new Scene(taskLayout);
	   stage.setScene(scene);
	   stage.show();
	}
	@FXML private void saveTaskButton(Event e) {
		this.taskList.setTaskByIndex(this.taskListView.getSelectionModel().getSelectedIndex(), 
				this.descriptionTextField.getText(),
				this.datePicker.getValue().getYear(),
				this.datePicker.getValue().getMonthValue(), 
				this.datePicker.getValue().getDayOfMonth());
	}
	
	
	@FXML private void addTaskButton(Event e) {
		this.taskList.addTaskButton(this.descriptionTextField.getText(), 
				this.datePicker.getValue().getYear(), 
				this.datePicker.getValue().getMonthValue(), 
				this.datePicker.getValue().getDayOfMonth());
	    this.taskListView.refresh();
	}
	@FXML private void removeTaskButton(Event e) {
		this.taskList.removeButton(this.taskListView.getSelectionModel().getSelectedIndex());
	}
	
	@FXML private void busyButton() {
	    	final URL resource = getClass().getResource("/resources/Alarm.mp3");
		   Media alarm = new Media(resource.toString());
           ObservableList<task> observableList = taskList.getObservableList();
           MediaPlayer mediaplayer = new MediaPlayer(alarm);
	if(!busyCheckBox.isPressed()) {
			   	
			   	for(task t : observableList) {
			   		if(t.getYear() == LocalDate.now().getYear() && 
			   				t.getMonth() == LocalDate.now().getMonthValue() &&
			   				t.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
			   			
			   	Alert alert = new Alert(AlertType.CONFIRMATION);
			   	alert.setTitle("Task Alert");
			   	alert.setHeaderText("Description: " + t.getText());
			   	alert.setContentText("Choose your option.");

			   	ButtonType buttonTypeOne = new ButtonType("Finished Task");
			   	ButtonType buttonTypeTwo = new ButtonType("Not finished", ButtonData.CANCEL_CLOSE);

			   	alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);

			   	Optional<ButtonType> result = alert.showAndWait();
			   	mediaplayer.play();
			   	if (result.get() == buttonTypeOne){
			   	   observableList.remove(t);
			   	   mediaplayer.stop();
			   	   
			   	} else {
			   		mediaplayer.stop();
			   	    break;
			   	}
			   	}
			   	}
			   	}
		}
		
	}