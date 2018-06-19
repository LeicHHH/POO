package control;

import java.io.IOException;
import java.time.LocalDate;
import view.addEditWindow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.util.Callback;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class taskController {
              public ObservableList<task> taskList = FXCollections.observableArrayList();
       @FXML  private MainController main;
       @FXML  private ListView<task> taskListView = new ListView<>();
	   @FXML  private Button addButton;       
       @FXML  private DatePicker datePicker = new DatePicker(); 
       @FXML  private TextField descriptionTextField = new TextField();
              private addEditWindow newWindow = new addEditWindow();
              
    public void initialize() {	
    	  datePicker.setValue(LocalDate.now());  	
 }
    
    public taskController(){
    	 taskList.add(new task("Prueba",1,8,2018));
    	 loadList();
    }
    
    public void addButton() throws IOException {
          newWindow.initialize();
   }
    
    public void addTask(Event e) {
	    taskList.add(new task(descriptionTextField.getText(), datePicker.getValue().getYear(), datePicker.getValue().getMonthValue(),datePicker.getValue().getDayOfMonth()));	  		  
    }
    
    public StackPane getListView(StackPane stackpane) {
		stackpane.getChildren().add(taskListView);
		return stackpane;
    }
    
    public void loadList() {
    	taskListView.setItems(taskList);
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
    
    public void removeButton() {
    	this.taskList.remove(taskListView.getSelectionModel().getSelectedIndex());
    }
    
    public void init(MainController  mainController) {
    	this.main = mainController;
    }
   
    

}
