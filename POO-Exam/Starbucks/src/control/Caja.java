package control;
/**
 * 
 * @author sebam
 * OUTPUT: 
 * 
 * Productos en el carro:
Latte Mediano Caliente
Ensalada de verduras
Cuchuflí
Praline Cake
JugoNaranjaGrande
            Total orden:1650
            Tipo de pago:Tarjeta de credito
 *
 */

public class Caja {
	
	
	public static int calcularTotal(Orden orden) {
		int total = 0;
		for(Producto p: orden.getOrden()) {
			total += p.getPrecio();
		}
		return total;
	}
	
	public static void printOrder(Orden orden) {
		System.out.println("Productos en el carro:");
		for(Producto p : orden.getOrden()) {
			System.out.println(p.toString() + "");
		}
		System.out.println("            Total orden:" + calcularTotal(orden) );
		System.out.println("            Tipo de pago:" + orden.getTipoPago());
	}
	
	public static void main(String[] args) {
		Producto producto0 = new Cafe("Latte", "Mediano", true,false);
		Producto producto1 = new Comestible("Ensalada de verduras",400);
		Producto producto2 = new Comestible("Cuchuflí",500);
		Producto producto3 = new Comestible("Praline Cake",600);
		Producto producto4 = new Jugo("Naranja","Grande");
		Orden orden = new Orden();
	    orden.agregarProducto(producto0);
	    orden.agregarProducto(producto1);
	    orden.agregarProducto(producto2);
	    orden.agregarProducto(producto3);
	    orden.agregarProducto(producto4);
	    orden.setTipoPago(new Debito(0));
	    printOrder(orden);
	    
	}

}
