
public class factorial {
	public static int factorialx(int x) {
		int z = 1;
		for(int i = 2; i <=x; i++) {
			z = z * i ;
			
		}
		return z;
	}
	
	public static void main(String[] args) {
			System.out.println("Factorial de 5: " +  factorialx(5));
		}
	}


