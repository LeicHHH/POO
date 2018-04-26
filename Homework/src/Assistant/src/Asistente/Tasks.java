package Asistente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.Clock;

public class Tasks {
	
	
	public Tasks() {
		
	}
	
	
	public void AddTask() {
		
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
	
	public void WriteFile() throws IOException {
		URL classesRootDir = getClass().getProtectionDomain().getCodeSource().getLocation();
		String URLString = classesRootDir.toString();
		@SuppressWarnings("resource")
		FileWriter fw = new FileWriter(URLString);
		    int i;
		    while ((i = fw.write(str);()) != -1)
		      System.out.print((char) i);
		
	}


}
