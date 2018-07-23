package control;

public class Agua extends Bebestible{
	String tipo;
	final int precio = 100;
	
	public Agua(String string){
		super(false);
		this.tipo = string;
	}

	@Override
	public String toString() {
		return("Agua" + this.tipo);
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

}
