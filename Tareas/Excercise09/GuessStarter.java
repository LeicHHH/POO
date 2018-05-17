import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

	
	
	public static void RandomNumber(int UserNumber,int RandomNumber) {
        if(UserNumber == RandomNumber) {
        	System.out.println("Congrats! You read my mind");
        	Runtime.getRuntime().exit(0);
        }
        else {
        	if(UserNumber > RandomNumber)
        	System.out.println("Your number is Higher");
        	else {
        	System.out.println("Your number is Lower");
        	}   	
        }
	}
	
	public static void AskUser(int RandomNumber) {
		int UserNumber;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Type a number:");
		UserNumber = in.nextInt();
		System.out.println("Your guess is:" + UserNumber);
		RandomNumber(UserNumber,RandomNumber);
	    AskUser(RandomNumber);
	}
	
	public static void main(String[] args) {
	Random random = new Random();
	int RandomNumber = random.nextInt(100) + 1;
	System.out.println("Im thinking of a number between 1 and 100");
	System.out.println("(including both). Can you guess whay it is?");
	AskUser(RandomNumber);
	}


}
