package Asistente;


public class Tasks {
	private int taskID;
	private String taskText;
	private int year;
	private int month;
	private int day;
	private boolean read;
	

	
	public Tasks(int ID, String text, int year, int month, int day, boolean readed ) {
		this.taskID = ID;
		this.taskText = text;
		this.year = year;
		this.month = month;
		this.day = day;
		this.read = readed;
	}

	
	public int getID() {
		return this.taskID;
	}
	
	public boolean getRead() {
		return this.read;
	}
	
	public void PrintDate() {

	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public String getText() {
		return this.taskText;
	}

	
}
