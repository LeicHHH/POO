package control;

import java.util.ArrayList;
import java.util.List;

public class taskList {   
	private List<task> taskList;
	
	public taskList() {
		this.taskList = new ArrayList<task>();
	}

	public void addTask(String text, int year, int month , int day){
		taskList.add(new task(text,year,month,day));
	}
	
	
	public task searchTask(int ID) {
		return taskList.get(ID);
	}
	
	public void removeTask(int ID) {
		taskList.remove(searchTask(ID));
	}
	public List<task> getList(){
		return this.taskList;
	}
	}
	/**
	 * @return the taskArray
	 */
