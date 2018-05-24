
public class Powa {
	public static double power(double x, int n) {
		if(n == 0) {
			return 1;
		}
		 if (n % 2 == 0) {
		        double m = power(x, n / 2);
		        return m * m;
		    } 
		 else return x * power(x, n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println("Potencia cuadrada del 1 al 5:");
		for(int i = 1; i <= 5 ; i++) {
			System.out.println(power(i,2));
		}
	}

}
