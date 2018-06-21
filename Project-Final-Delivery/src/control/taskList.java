package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

public class taskList {
	 
       @FXML  private ObservableList<task> taskList;
    
    public taskList(){
    	
    	this.taskList = FXCollections.observableArrayList();
    	taskList.add(new task("Prueba 2 asdfk",2018,6,21));
    }
    
    
    public void addTaskButton(String text, int year, int month, int dayOfMonth) {
	    this.taskList.add(new task(text,year,month,dayOfMonth));	  		  
    }
    
    public ObservableList<task> getObservableList() {
		return this.taskList;
    }
    
    
    public void removeButton(int index) {
    	this.taskList.remove(index);
    }
    
    public void setTaskByIndex(int index,String Description, int year, int month , int dayOfMonth) {
    	this.taskList.get(index).setDescription(Description);
    	this.taskList.get(index).setDayOfMonth(dayOfMonth);
    	this.taskList.get(index).setMonth(month);
    	this.taskList.get(index).setYear(year);
    }

}
