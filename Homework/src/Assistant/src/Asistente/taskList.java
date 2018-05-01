package Asistente;

import java.util.ArrayList;


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
	
	
	public int searchTask(int searchID) {
		for(Tasks N : taskArray){
	        if(N.getID() == searchID ) {
	        	return searchID;
	        }
	        else {
	        	System.out.println("No encontrado");
	        }          
	    }
		return 0;
	}
	
	public void removeTask(int searchID) {
		int removeTHIS = searchTask(searchID);
		taskArray.remove(removeTHIS);
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
