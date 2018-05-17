package control4;

import java.util.Scanner;

public class Ex3 {
	
	public static void PrintDate(String Day, String month, int year, int date,int format) {
		if( format == 1) {
			System.out.println(Day + ", " + month + " " + date + ", " + year);
		}
		else {
			System.out.println(Day + " " + date + " " + month + " " + year);
		}
		
	}
		
	
public static void askUser() {
		Scanner in = new Scanner(System.in);
		System.out.print("Day:");
		String day = in.nextLine();
		System.out.println("Month:");
		String month = in.nextLine();
		System.out.println("Year:");
		int year = in.nextInt();
		System.out.println("Date:");
		int date = in.nextInt();
		System.out.println("(1) American format, (0) European format:");
		int format = in.nextInt();
		PrintDate(day,month,year,date,format);
		
	}

public static void main(String[] args) {
	askUser();
	
}

}
