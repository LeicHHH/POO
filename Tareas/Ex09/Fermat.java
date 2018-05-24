
public class Fermat {
	public static void checkFermat(double a,double b, double c, double n){
		if((Math.pow(a, n)) + (Math.pow(b, n)) == (Math.pow(c, n))) {
			System.out.println("Holy smokes, Fermat was wrong!");
		}
		else {
			System.out.println("No, that doesn’t work.");
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
		checkFermat(2,1,3,i);
		}
	}

}
