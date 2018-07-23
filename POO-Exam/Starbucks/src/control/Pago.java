package control;

public abstract class Pago {
	int transactionID;
	public Pago(int ID) {
		this.transactionID = ID;
	}
	
	public abstract String toString();
	
	
}

