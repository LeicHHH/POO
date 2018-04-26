package Asistente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.Clock;
import java.util.Scanner;

public class Tasks {
	
	
	public Tasks() {
		
	}
	
	
	public void AddTask() {
		System.out.println("Ingrese la tarea:");
		Scanner in = new Scanner(System.in);
		String InTask = in.toString();
		
	}
	public void ReadFile() throws IOException {
		URL classesRootDir = getClass().getProtectionDomain().getCodeSource().getLocation();
		String URLString = classesRootDir.toString();
		@SuppressWarnings("resource")
		FileReader fr = new FileReader(URLString);
		    int i;
		    while ((i=fr.read()) != -1)
		      System.out.print((char) i);
	}
	
	public void WriteFile(String ReceivedTask) throws IOException {
		URL classesRootDir = getClass().getProtectionDomain().getCodeSource().getLocation();
		String URLString = classesRootDir.toString();
		@SuppressWarnings("resource")
		FileWriter fw = new FileWriter(URLString);
		fw.write(ReceivedTask);
		
	}


}
