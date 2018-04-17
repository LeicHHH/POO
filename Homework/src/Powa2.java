
public class Powa2 {
		public static double power(double x, int n) {
			double z = 1;
			if(n == 0) {
				return 1;
			}
			else {
				for(int i = 1; i <= n ; i++) {
					z = z*x;
				}
			}
				return z;
		}
		
		public static void main(String[] args) {
			System.out.println("Potencia cuadrada del 1 al 5:");
			for(int i = 1; i <= 5 ; i++) {
				System.out.println(power(i,2));
			}
		}

	}


