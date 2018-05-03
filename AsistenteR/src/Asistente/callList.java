package Asistente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class callList {
    private List<Calls> entries;
    
	public callList() {
		entries = new ArrayList<Calls>();
	}
	
	public List<Calls> getCall(){
	return this.entries;
	
	}
	
	public void readCalls() throws IOException, InterruptedException {
		
		File file = new File("C:\\Users\\sebam\\AsistenteR\\src\\Asistente\\file.txt");
		  @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		 String line = null;
		  while ((line = br.readLine()) != null)
			  System.out.println(line);
		      
		  
	}
	
	public void addCall() throws InterruptedException, IOException {
		//String line = readCalls();
		//TimeUnit.SECONDS.sleep(1);
		//entries.add(new Calls(line));	
	}
}
