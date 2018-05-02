package Asistente;

public class Contacto {
	private int ID;
	private int number;
	private String AreaCode;
	private String Name;
	
	
	public Contacto(int ID, int number, String AreaCode, String Name ) {
		this.ID = ID;
		this.number = number;
		this.AreaCode = AreaCode;
		this.Name = Name;
	}
	
	public int getID() {
		return this.ID;
	}
	public int getNumber() {
		return this.number;
	}

	public String getAreaCode() {
		return this.AreaCode;
	}

	public String getName() {
		return this.Name;
	}


}
