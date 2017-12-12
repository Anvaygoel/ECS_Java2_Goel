import java.util.Scanner;

public class CollatzSquence 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Let's create a COLLAT SEQUENCE");
		int x;
		int odd;
		int even = 0;
		
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
			System.out.print( "-" + x/2);
			x = x/2;
			}
			else 
			{
				System.out.println( "-" + (x*3)+1);
				x = x/2;
			}
			
			
		} while (  x != 1);
		
		
			
			
			
		
			
		
	}

}
