package Asistente;

import java.util.ArrayList;
import java.util.Calendar;

public class taskList {        
	private ArrayList<Tasks> taskArray;
	
	
	public taskList() {
		this.taskArray = new ArrayList<Tasks>();
	}
	

	public void addTask(int ID,String text, int year, int month , int day,boolean readed){	
		this.taskArray.add(new Tasks(ID,text,year,month,day,readed));
	}
	
	public void printTasks() {
		if(this.taskArray.isEmpty())
		 System.out.println("Empty toDo List");
	    else
		for(Tasks task: this.taskArray) {
			System.out.println("Description:" + task.getText() + "Date:" + task.getDate());
	}
}
	
	
	public int searchTask(Calendar Date) {
		for(Tasks N : taskArray){
	        if(Date.equals(N.getSearchedDate()) ) {
	        	return N.getID();
	        }
	        else {
	        	System.out.println("No encontrado");
	        }          
	    }
		return 0;
	}
	
	public void removeTask(Calendar Date) {
		taskArray.remove(searchTask(Date));
		System.out.println("Task removed");
	}
	/**
	 * @return the taskArray
	 */


}
