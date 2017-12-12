
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class ShorterDoubleDice


{
		public static void main(String[] args)


	{

Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x =  r.nextInt(6);


		int y =  r.nextInt(6);

			
		 
		String again;

		do
		{
			
			y = r.nextInt(6);
			x = r.nextInt(6);
			
			System.out.println("HERE COMES THE DICE!");


			System.out.println("Roll#1: " +  y);

			System.out.println("Roll#2 : "  + x);


			System.out.println("The Total is " + (y+x));

			System.out.println("Do you want to roll again (y/n)?");
			again = keyboard.next();

		}while ( again.equals("y"));
		
		


		


	}


}




