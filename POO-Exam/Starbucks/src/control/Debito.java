package control;

public class Debito extends Pago {
    final String tipoPago = "Tarjeta de debito";
	public Debito(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return this.tipoPago;
	}

}
