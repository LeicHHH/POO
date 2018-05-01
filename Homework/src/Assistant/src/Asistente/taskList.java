package Asistente;

import java.util.ArrayList;
import java.util.Calendar;

public class taskList {        
	private ArrayList<Tasks> taskArray;
	
	
	public taskList() {
		taskArray = new ArrayList<Tasks>();
	}
	

	public void addTask(int ID,String text, int year, int month , int day,boolean readed){	
		ID++;
		taskArray.add(new Tasks(ID,text,year,month,day,readed));
	}
	
	public void printTasks() {
		System.out.println(taskArray);
		

	}
	
	
	public int searchTask(Calendar Date) {
		for(Tasks N : taskArray){
	        if(Date.equals(N.getDate()) ) {
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
	}
	/**
	 * @return the taskArray
	 */
	public ArrayList<Tasks> getTaskArray() {
		return taskArray;
	}

	/**
	 * @param taskArray the taskArray to set
	 */
	public void setTaskArray(ArrayList<Tasks> taskArray) {
		this.taskArray = taskArray;
	}


}
