package control4;

public class mystery {
	
	public static int mistery(int a, int b) {
		if(b == 0) return 0;
		if(b % 2 == 0) return mistery(a+a,b/2);
		return mistery(a+a,b/2) +a;
	}

	public static void main(String[] args) {
		int in = mistery(2,25);
		System.out.println("Mistery1:" + in);
		int on = mistery(3,11);
		System.out.println("Mistery2:" + on);
	}
}

/**
 Mistery1:50
Mistery2:33
**/
