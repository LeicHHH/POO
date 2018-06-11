package control;

import java.io.IOException;
import java.util.Scanner;


public class Assistant {
	private taskList TaskList1= new taskList();
	private callList CallList1 = new callList();
	
    public Assistant() {
    	
 }
    public void readCalls() throws IOException, InterruptedException {
    	this.CallList1.readCalls();
     }
    
    public void readTask() {
     this.TaskList1.printTasks();
    }
    
	
    // public void AlertUser() {
    	
    // }
    
    // public CurrentUserStatus() {
    	
    //	if(BusyUser()) {
    //		
    //	}
    	
    //	else {
    //		Notification();
    		  //	}
    	
    //}
    //public void Feed() {
    	
    //}
    public void AddTask() {
    	int ID = 0;
    	@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
    	System.out.println("Task Description:");
    	String text = in.nextLine();
    	System.out.println("Year:");
    	int year = in.nextInt();
    	System.out.println("Month:");
    	int month = in.nextInt();
    	System.out.println("Day:");
    	int day = in.nextInt();
    	boolean readed = true;
    	this.TaskList1.addTask(ID, text, year, month, day, readed);
    	ID++;
    }
	
}
