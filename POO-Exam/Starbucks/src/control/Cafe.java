package control;

public class Cafe extends Bebestible {
	String preparacion;
	String tama�o;
	boolean caliente;
	final int precio = 50;
	
	public Cafe(String preparacion, String tama�o, boolean caliente,boolean whiskey) {
		super(whiskey);
		this.caliente = caliente;
		this.preparacion = preparacion;
		this.tama�o = tama�o;
		
	}
	
	public int getPrecio() {
		return this.precio;
	}

	public String toString() {
if(this.caliente) {
	if(this.alcohol) {
	return (this.preparacion + " " + this.tama�o + " Caliente" + " Whiskey" );
	}
	return (this.preparacion + " " + this.tama�o + " Caliente" );
		}
else
      if(this.alcohol) {
		return (this.preparacion + " " + this.tama�o + " Frio" + " Whiskey" );
		
	}
	return (this.preparacion + " " + this.tama�o + " Frio" );
}
}
