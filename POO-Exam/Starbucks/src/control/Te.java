package control;

public class Te extends Bebestible{
	String preparacion;
	String tama�o;
	boolean caliente;
	final int precio = 50;
	
	public Te(String preparacion, String tama�o, boolean caliente) {
		super(false);
		this.caliente = caliente;
		this.preparacion = preparacion;
		this.tama�o = tama�o;
		
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public String toString() {
if(this.caliente) {
	return (this.preparacion + this.tama�o + "Caliente");
		}
		return (this.preparacion + this.tama�o + "Frio");
		
	}

}
