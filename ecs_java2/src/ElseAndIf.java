
public class ElseAndIf 
{
	public static void main(String[] args)
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if ( cars > people )
		{
			System.out.println("We should take the cars.");
			
		}
		else if ( cars < people )
		{
			System.out.println("we should not take the cars");
		}	
		
		
		
		if ( buses < cars )
		{
			System.out.println("That's too many buses.");
			
		}
		else if ( buses > cars )
		{
			System.out.println("maybe we can take the buses.");
		}	
		else
		{
			System.out.println(" we still can't decide");
		}
		
		if ( people > buses )
		{
			System.out.println("All right, let's just take the buses");
			
		}
		else 
		{
			System.out.println("Fine, let's just stay home then.");
		}
	
		
	}

}
