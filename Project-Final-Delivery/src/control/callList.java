package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.scene.control.ListView;

public class callList {
           ListView<String> callListView = new ListView<>();
	public callList() {
        
		  }
	
	public void readFile() throws IOException {
		File file = new File("C:\\Users\\sebam\\AsistenteR\\src\\resources\\file.txt");
		 
		  @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  while ((st = br.readLine()) != null)
			    callListView.getItems().add(st);
		 
		  }
		

    public ListView<String> getListView(){
    	return this.callListView;
    }
    }
	
		
	


