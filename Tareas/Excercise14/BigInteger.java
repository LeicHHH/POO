package control4;

import java.math.BigInteger;

public class BigIntegerx {

	public static BigInteger factorialx(int x) {
		BigInteger BigInteger1 = BigInteger.valueOf(1);
		
		for(int i = 2; i <= x; i++) {
			BigInteger BigInteger2 = BigInteger.valueOf(i);
			BigInteger1 = BigInteger1.multiply(BigInteger2);
			
		}
		return BigInteger1;
	}
	
	
	
	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++)
			System.out.println("Factorial de " + i + ": " +  factorialx(i).toString());
		}
	
	}

