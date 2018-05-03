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
		this.taskDate.set(year, month, day);
		this.read = readed;
	}

	
	public int getID() {
		return this.taskID;
	}
	
	public boolean getRead() {
		return this.read;
	}
	
	public String getDate() {
		return this.taskDate.toString();
	}
	public Calendar getSearchedDate() {
		return this.taskDate;
	}
	
	public String getText() {
		return this.taskText;
	}

	
}
