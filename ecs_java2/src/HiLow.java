import java.util.Random;
import java.util.Scanner;

public class HiLow 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int num1;
		int HILOW =  r.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		num1 = keyboard.nextInt();
		
		
		if ( num1 < HILOW)
		{
			System.out.println(" Sorry you are too low. I was thinking of " +  HILOW + "");
		}
		if ( num1 > HILOW)
		{
			System.out.println("Sorry, you are too high1. I was thinking of " +  HILOW + "");
		}
		if ( HILOW == num1)
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
	}

}
