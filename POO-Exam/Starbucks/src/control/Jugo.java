package control;

public class Jugo extends Bebestible{
		String preparacion;
		String tamaño;
		final int precio = 100;
		
		public Jugo(String preparacion, String tamaño) {
			super(false);
			this.preparacion = preparacion;
			this.tamaño = tamaño;
			
		}
		
		public int getPrecio() {
			return this.precio;
		}
		
		public String toString() {
		return ("Jugo" + this.preparacion + this.tamaño);	
		}

	}
