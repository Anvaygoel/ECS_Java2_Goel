import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		
		
		
		
		System.out.println("This is a calculator!");
		System.out.println("Insert your calculation as ### operator ###");
		Scanner keyboard = new Scanner(System.in);
		double a, b, c;
		String opp;
	
	
		do
		{
			System.out.println("> ");
			a = keyboard.nextDouble();
			opp = keyboard.next();
			b = keyboard.nextDouble();
			
			if ( opp.equals("*"))
			{
				c = a * b;
			}
			else if(opp.equals("+"))
			{
				c = a + b;
				
			}
			else if(opp.equals("/"))
			{
				c = a / b;
				
			}
			else if(opp.equals("-"))
			{
				c = a - b;
			}
			else if ( opp)
			else
			{
				System.out.println("opperator undifined: " + opp + " .");
			}
			
		}while ( a!=0);

	}
}