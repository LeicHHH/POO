package Asistente;

import java.util.ArrayList;


public class taskList {
	private Tasks newTask;         
	private ArrayList<Object> taskArray;
	
	
	public taskList() {
		taskArray = new ArrayList<Object>();
		newTask = new Tasks();
	}

	public void addTask(String text, int year, int month , int day ) {
		newTask.setCalendar(year, month, day);
		newTask.setText(text);
		taskArray.add(newTask);
	}
	
	public void printTasks() {
		System.out.println(taskArray);
		

	}
	
	
	public Tasks searchTask(String search) {
		for(Object N : taskArray){
	        if(newTask.getText() != search  && newTask.getText().contains(search)) {
	        	return newTask;
	        }
	           
	    }
	}
	
	public void removeTask() {
		
	}
	/**
	 * @return the taskArray
	 */
	public ArrayList<Object> getTaskArray() {
		return taskArray;
	}

	/**
	 * @param taskArray the taskArray to set
	 */
	public void setTaskArray(ArrayList<Object> taskArray) {
		this.taskArray = taskArray;
	}
	




}
