package control;

public abstract  class Bebestible extends Producto {
	boolean alcohol;
	public Bebestible(boolean alcohol) {
		super();
		this.alcohol = alcohol;
		
	}

	@Override
	public abstract String toString();

	@Override
	public abstract int getPrecio();
	


}
