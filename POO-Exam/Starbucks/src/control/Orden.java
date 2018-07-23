package control;

import java.util.ArrayList;

public class Orden {
	ArrayList<Producto> listaProductos;
    Pago tipoPago;
	
	public Orden() {
		this.listaProductos = new ArrayList<>();
		
	}
	
	public void agregarProducto(Producto p) {
	 this.listaProductos.add(p);
	}
	
	public ArrayList<Producto> getOrden(){
		return this.listaProductos;
	}
	
	public String getTipoPago() {
		return this.tipoPago.toString();
	}
	public void setTipoPago(Pago pago) {
		this.tipoPago = pago;
	}

}
