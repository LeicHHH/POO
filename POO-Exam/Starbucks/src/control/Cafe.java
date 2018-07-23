package control;

public class Cafe extends Bebestible {
	String preparacion;
	String tamaño;
	boolean caliente;
	final int precio = 50;
	
	public Cafe(String preparacion, String tamaño, boolean caliente,boolean whiskey) {
		super(whiskey);
		this.caliente = caliente;
		this.preparacion = preparacion;
		this.tamaño = tamaño;
		
	}
	
	public int getPrecio() {
		return this.precio;
	}

	public String toString() {
if(this.caliente) {
	if(this.alcohol) {
	return (this.preparacion + " " + this.tamaño + " Caliente" + " Whiskey" );
	}
	return (this.preparacion + " " + this.tamaño + " Caliente" );
		}
else
      if(this.alcohol) {
		return (this.preparacion + " " + this.tamaño + " Frio" + " Whiskey" );
		
	}
	return (this.preparacion + " " + this.tamaño + " Frio" );
}
}
