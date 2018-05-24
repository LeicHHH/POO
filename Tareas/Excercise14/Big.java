package control4;

public class Big {
	
	public static int factorialx(int x) {
		int z = 1;
		for(int i = 2; i <= x; i++) {
			z = z * i ;
			
		}
		return z;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++)
			System.out.println("Factorial de " + i + ": " +  factorialx(i));
		}
	}

/**
* 2.- Los valores son muy grandes para el tipo de variable int
*
**/