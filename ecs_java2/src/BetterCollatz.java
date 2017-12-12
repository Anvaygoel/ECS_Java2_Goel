import java.util.Scanner;

public class BetterCollatz 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Let's create a COLLAT SEQUENCE");
		int x;
		int counter = 0;
		
		
		System.out.println("Rules: ");
		System.out.println(" If the number is even, divide it by two.");
		System.out.println("If the number is odd, multiply by 3 and add 1 ");
		System.out.println("Repeat this decision until you reach 1");
		System.out.println(" Starting number: " );
		x = keyboard.nextInt();
		
		
		
		
		do
		{
			

			if ( x %2 == 0)
			{
			System.out.println( "-" + x/2);
			x = x/2;
			counter++;
			}
			else 
			{
				System.out.println( "-" + (x*3)+1);
				x = x/2;
				counter++;
			}
			
			
		} while (  x != 1);
		
		System.out.println("There are " + counter + " numbers ");
			
			
			
		
			
		
	}

}
