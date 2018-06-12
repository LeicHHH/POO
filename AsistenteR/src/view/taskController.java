package view;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import control.task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class taskController {
	      private ListView<task> taskListView;
    @FXML private TextField descriptionTextField;
    @FXML private DatePicker datePicker;
          private AnchorPane taskLayout;
          private task task;
          private ArrayList<task> taskList;
          private Stage stage;
    @FXML private Button addButton;
    
    @FXML private void initialize() {
    	 datePicker.setValue(LocalDate.now());
    }
    
    public taskController() {
    	this.taskListView = new ListView<>();
    	this.descriptionTextField = new TextField();
    	this.datePicker = new DatePicker();
    	this.taskList = new ArrayList<task>();
    	this.stage = new Stage();
    	
    }
    
    public void showAddTask() throws IOException {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(taskController.class.getResource("addTask.fxml"));
		taskLayout = loader.load();
	    Scene scene = new Scene(taskLayout);
	    stage.setScene(scene);
	    stage.show();

    }
  
    public ListView<task> addTask() throws IOException, InterruptedException {
      ObservableList<task> taskObservable = FXCollections.observableList(taskList);
      taskList.add(new task(descriptionTextField.getText(), datePicker.getValue().getYear(), datePicker.getValue().getMonthValue(),datePicker.getValue().getDayOfMonth()));	  		
      taskListView.setItems(taskObservable);
 	  taskListView.setCellFactory(new Callback<ListView<task>, ListCell<task>>(){	    
 	        	  public ListCell<task> call(ListView<task> p) {
 	                 
 	                 ListCell<task> cell = new ListCell<task>(){
 	                     protected void updateItem(task t, boolean bln) {
 	                         super.updateItem(t, bln);
 	                         if (t != null) {
 	                             setText("Description:\n" + t.getText() + "    \nDate: " + t.getDayOfMonth() + "/" + t.getMonth()+ "/" + t.getYear() );
 	                         }
 	                     }
 	  
 	                 };
 	                  
 	                 return cell;
 	             }
 	             
 	         });
 	         Stage stage = (Stage) addButton.getScene().getWindow();     
	         stage.close();
 	         return  taskListView;
    }
    
    
    public void editTask(int index) throws IOException {
    	task = taskList.get(index);
        descriptionTextField.setText(task.getText());
        datePicker.setValue(LocalDate.of(task.getYear(), task.getMonth(), task.getDayOfMonth()));
        FXMLLoader loader = new FXMLLoader();
		loader.setLocation(taskController.class.getResource("editTask.fxml"));
		taskLayout = loader.load();
	    Scene scene = new Scene(taskLayout);
	    stage.setScene(scene);
	    stage.show();
    }
    
    public void editTaskButton() {
      task.setDescription(descriptionTextField.getText());
 	  task.setYear(datePicker.getValue().getYear());
 	  task.setMonth(datePicker.getValue().getMonthValue());
 	  task.setDayOfMonth(datePicker.getValue().getDayOfMonth());
  	  Stage stage = (Stage) addButton.getScene().getWindow();
      stage.close();
    }
    
    public void removeButton(int index) {
    	this.taskList.get(index);
    }
    
    public List<task> getList() {
    	return this.taskList;
    }
   
    

}
