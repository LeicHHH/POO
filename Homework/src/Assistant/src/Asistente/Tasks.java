package Asistente;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.Clock;
import java.util.Scanner;
import java.util.Date;

public class Tasks {
	
	
	public Tasks() {
		
	}
	
	
	
	public void AddTask() throws IOException {
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Ingrese la tarea:");
		String NewTask = scanUser.nextLine();
		WriteFile(NewTask);
		System.out.println("Ingrese la fecha de la forma ddmmyy:");
		NewTask = scanUser.nextLine();
		WriteFile(NewTask);
		System.out.println("Ingrese la hora de la forma hhmm");
		NewTask = scanUser.nextLine();
		WriteFile(NewTask);
		scanUser.close();
	}
	
	public void ReadFile() throws IOException {
		URL classesRootDir = getClass().getProtectionDomain().getCodeSource().getLocation();
		String URLString = classesRootDir.toString();
		@SuppressWarnings("resource")
		FileReader fr = new FileReader(URLString + "/Tasks.txt");
		    int i;
		    while ((i=fr.read()) != -1)
		      System.out.print((char) i);
	}
	
	public void WriteFile(String ReceivedTask) throws IOException {
		URL classesRootDir = getClass().getProtectionDomain().getCodeSource().getLocation();
		String URLString = classesRootDir.toString();
		@SuppressWarnings("resource")
		FileWriter fw = new FileWriter(URLString + "/Tasks.txt");
		fw.write(ReceivedTask);
	}
	
	public static void main() {
		
	}

}
