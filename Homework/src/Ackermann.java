
public class Ackermann {
	public static int ack(int m, int n) {
		if(m == 0) {
			return n + 1;
		}
		else if (m > 0 && n == 0) {
			return ack(m - 1,1);
		}
		if(m > 0 && n > 0) {
			return ack(m - 1, ack(m,n - 1));
		}
		return n;
		
	}
	public static void main(String[] args) {
		
	    int j = 0;
		for(int i = 0 ; i<3 ; i++) {
	    System.out.println(ack(i,j));
	    j++;
				
	}
	}
}
