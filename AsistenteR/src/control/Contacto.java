package control;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contacto {
	private StringProperty Number;
	private StringProperty Name;
	
	
	public Contacto( String number, String Name ) {
		this.Number = new SimpleStringProperty(number);
		this.Name =  new SimpleStringProperty(Name);
	}

	public String getAreaCode() {
		return this.Number.toString();
	}

	public String getName() {
		return this.Name.toString();
	}


}
