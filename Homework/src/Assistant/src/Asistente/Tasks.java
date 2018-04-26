package Asistente;

import java.util.Calendar;

public class Tasks {
	private int taskID;
	private String taskText;
	private Calendar taskDate;
	private boolean read;
	
	public Tasks(int ID, String text, int year, int month, int day, boolean readed ) {
		this.taskID = ID;
		this.taskText = text;
		taskDate.set(year,month,day);
		this.read = readed;
	
	}
	
	public int getID() {
		return this.taskID;
	}
	
	public boolean getRead() {
		return this.read;
	}
	
	public Calendar getDate() {
		return this.taskDate;
	}
	
	public String getText() {
		return this.taskText;
	}
	
	//public void setID(int ID) {
	//	this.taskID = ID;
	//}
	
	//public void setRead(boolean read) {
		//this.read = read;
	//}
	
	//public void setText(String taskText) {
	//	this.taskText = taskText;
	//}
	
//	public void setCalendar(int year, int month,int day) {
//		this.taskDate.set(year, month, day);
//	}
	
}
