package control;

public class Te extends Bebestible{
	String preparacion;
	String tamaño;
	boolean caliente;
	final int precio = 50;
	
	public Te(String preparacion, String tamaño, boolean caliente) {
		super(false);
		this.caliente = caliente;
		this.preparacion = preparacion;
		this.tamaño = tamaño;
		
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public String toString() {
if(this.caliente) {
	return (this.preparacion + this.tamaño + "Caliente");
		}
		return (this.preparacion + this.tamaño + "Frio");
		
	}

}
