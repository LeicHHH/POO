package control;

public class Efectivo extends Pago {
    final String tipoPago = "Efectivo";
	public Efectivo(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return this.tipoPago;
	}
	

}
