import java.util.Scanner;

public class HowOldSpecfically
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age = 0;
		

		
			System.out.println("Hey what's your name?");
			name = keyboard.next();
			
		
			System.out.println("Ok " + name + ", how old are you?");
			age = keyboard.nextInt();
		
		if ( age < 16)
		{
			System.out.println("You can't drive yet");
		}
		 
		if ( age >=16&&age<18)
		{
			System.out.println("You can drive but you can't vote");
		}
		
		
		
		
	
	    if ( age >=18&&age<=24)
	    {
	    	System.out.println("You can vote but not rent a car");
	    	
	    }
	    
	    if ( age > 25)
	    {
	    	
		    	System.out.println("You can pretty much do anything you want");
		    
	    }
        
	  
	}   
}