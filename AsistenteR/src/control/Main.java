package control;


import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static Assistant Assistant1 = new Assistant();
	
	public Main() {
		
	}
	public static void initialize() throws IOException, InterruptedException {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("-. (1) Para agregar tarea");
        System.out.println("-. (2) Para ver tarea");
        System.out.println("-. (3) Para ver llamadas");
        System.out.println("-. (4) Para ver noticias");
        System.out.print("Seleccione opcion:");
        switch (in.nextInt()) {
            case 1:  
            	Assistant1.AddTask();
            	initialize();
                     break;
            case 2: 
            	Assistant1.readTask();
            	initialize();
                     break;
            case 3: 
            	Assistant1.readCalls();
            	initialize();
            	break;
           case 4:  
        	   System.out.println("Working...");
        	   initialize();
           //          break;
            default: 
            	System.out.println("Opción inválida");
            break;
	}
	}
	
	public static void main(String [] args) throws IOException, InterruptedException {	    
				initialize();
	}


}
