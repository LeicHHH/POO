package Asistente;

import java.io.IOException;
import java.util.Scanner;
public class Main {
	private static Assistant newAssistant;
	
	public Main() {
		
	}
	
	
	public static void main(String [] args) throws IOException, InterruptedException {	    
		        Scanner in = new Scanner(System.in);
		        System.out.println("-. (1) Para agregar tarea");
		        System.out.println("-. (2) Para ver llamadas");
		        System.out.println("-. (3) Para ver noticias:");
		        in.nextInt();
		        switch (3) {
		            case 1:  
		            	newAssistant.AddTask();
		                     break;
		            case 2: 
		            	newAssistant.readCalls();
		                     break;
		           // case 3:  
		           //          break;
		            default: 
		            	System.out.println("Opción inválida");
                    break;
	}

}
