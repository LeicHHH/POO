package control;

public class StarBucksClient extends Pago{
    final String tipoPago = "Tarjeta StarBucks";
	public StarBucksClient(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return this.tipoPago;
	}

}
