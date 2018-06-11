package view;

import java.io.IOException;
import java.time.LocalDate;

import control.task;
import control.taskList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class taskController {
    @FXML private TextField descriptionTextField;
    @FXML private DatePicker datePicker;
          private AnchorPane taskLayout;
          private task task;
          private taskList taskList;
    @FXML private Stage stage;
    @FXML private Button addButton;
    
    public taskController() {
    	this.taskList = new taskList();
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
  
    public void addTask() throws IOException, InterruptedException {
       this.taskList.addTask(descriptionTextField.getText(),datePicker.getValue().getYear(),datePicker.getValue().getMonthValue(),datePicker.getValue().getDayOfMonth());
       System.out.println(taskList.getList().get(0).getText());
       Stage stage = (Stage) addButton.getScene().getWindow();     
       stage.close();
    }
    
    
    public void editTask(int index) throws IOException {
    	task = taskList.searchTask(index);
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
    	this.taskList.removeTask(index);
    }
    
    public taskList getList() {
    	return this.taskList;
    }
   
    

}
