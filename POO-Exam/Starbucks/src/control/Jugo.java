package control;

public class Jugo extends Bebestible{
		String preparacion;
		String tama�o;
		final int precio = 100;
		
		public Jugo(String preparacion, String tama�o) {
			super(false);
			this.preparacion = preparacion;
			this.tama�o = tama�o;
			
		}
		
		public int getPrecio() {
			return this.precio;
		}
		
		public String toString() {
		return ("Jugo" + this.preparacion + this.tama�o);	
		}

	}
