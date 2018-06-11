package control;

public class task {
	private String taskText;
	private int year;
	private int month;
	private int dayOfMonth;
	
	public task(String text, int year, int month, int dayOfMonth) {
		this.taskText = text;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        
	}

	public String getText() {
		return this.taskText;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
     
	public int getDayOfMonth() {
		return this.dayOfMonth;
	}
	
	public void setDescription(String Description) {
		this.taskText = Description;
	}
	public void setYear(int year) {
		this.year =  year;
	}
	public void setMonth(int month) {
		this.month =  month;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth =  dayOfMonth;
	}


	
}
