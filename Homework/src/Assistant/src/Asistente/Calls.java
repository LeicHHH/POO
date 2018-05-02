package Asistente;

import java.util.Calendar;;

public class Calls {
	private String LLamada;
	private Calendar time;
	
	public Calls(int year, int month, int day, int hourOfDay, int minute,int second, String Llamada) {
		time.set(year, month, day, hourOfDay, minute, second);
		this.LLamada = Llamada;
	}
	
	public String getLLamada() {
		return this.LLamada;
	}
	
	public void SetLlamada(String LLamada) {
		this.LLamada = LLamada;
	}
	

}
