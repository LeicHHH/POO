package Asistente;

import java.io.IOException;
import java.util.Scanner;


public class Assistant {
	private taskList newTaskList= new taskList();
	private callList newCallList = new callList();
	
    public Assistant() {
 }
    public void readCalls() throws IOException, InterruptedException {
    	newCallList.readCalls();
     }
    
    //public boolean Notification() {
		
		
    //}
    
	
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
    	System.out.println("Mark as read:");
    	boolean readed = in.nextBoolean();
    	newTaskList.addTask(ID, text, year, month, day, readed);
    	ID++;
    }
	
}
