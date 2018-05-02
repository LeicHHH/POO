package Asistente;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class callList {
    private List<Calls> entries;
    
	public callList() {
		entries = new ArrayList<Calls>();
	}
	
	public List<Calls> getCall(){
	return this.entries;
	
	}
	
	public String readCalls() throws IOException, InterruptedException {
		File file = new File("C:\\Users\\sebam\\Documents\\file.txt");
		  @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  while ((br.readLine()) != null)
			  TimeUnit.NANOSECONDS.sleep(1);
			  return br.readLine();
		      
		  
	}
	
	@SuppressWarnings("null")
	public void addCall() throws InterruptedException, IOException {
		String line = readCalls();
		TimeUnit.SECONDS.sleep(1);
		Calls newcall = null;
		newcall.SetLlamada(line); 
		
		
	}
}
