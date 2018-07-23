package control;

public class Credito extends Pago{
    final String tipoPago = "Tarjeta de credito";

	public Credito(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return this.tipoPago;
	}

}
