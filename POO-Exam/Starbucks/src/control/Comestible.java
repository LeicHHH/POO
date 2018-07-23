package control;

public class Comestible extends Producto {
	String Nombre;
	int precio;
	
	public Comestible(String string, int i) {
		super();
        this.Nombre = string;
        this.precio = i;
	}
	
	@Override
	public int getPrecio() {
		return this.precio;
		
	}
	@Override
	public String toString() {
		return this.Nombre;
	}

}
