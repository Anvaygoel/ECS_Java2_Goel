
public class FillInMethodss 
{
	public static void main(String[] args)
	{
		System.out.println("Watch as we demonstarte methods");
		
		System.out.println();
		System.out.println("I'm going to get a random character from A-2");
		char c = 'C' ;
		 randchar (args);
		System.out.println("The character is: " + c );
		
		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		for ( int  n = -10 ; n <= 10; n = n+1 )
			System.out.print(n + " " ); System.out.print("How was that?");
		 counter (args);
		
		
		System.out.println();
		System.out.println("Now we tke the absoloute value of a number");
		int x, y = 99;
		x = -10;
		 abso(args);
		System.out.println("|" + x + "| = 10");
		
		System.out.println();
		System.out.println("That's all. This program has been broguth to you by: ");
		credits(args);
		
	}


public static void credits (String[] args)
{
	 	// no perameters
 
	 {
	 	
	 	 
	 	  System.out.println();
	 	  System.out.println("programmed by Sam Cummings");
	 	  System.out.println("modified by Anvay Goel");
	 	  System.out.println("This code is distributed under the terms of the standard");
	 	  
	 	  System.out.println("BSD license. Do with it as you wish.");
	 }
}

	 

	 	  
	

	
		public static  void  randchar (String[] args)
		{	
		// no perameters.
		 
		 {
		 
		 //chose a random charcter in the range "A" tp "Z"

		  
		  int numval;
		  char chatval;
		  
		  //pick  a random number from 0 to 25
		   numval = (int)(Math.random()*26);
		   //now add that offset to the value of the letter 'A'
		     chatval = (char) ('A' + numval);
		 }
		
		
		   
		return ;
		}

{
}
{
	
		
	}
		
		
	
			
		
		
		
		   


		   
		

		
		 
		 
		 	public static void counter(String[] args)
		 	{
				
		 		
		 	// parameters are:
		 	 int start = 0 ;
		 	  int stop = 0 ;
		 	  
		 	  {
		 	  
		 	  	// counts from start to stop by ones
		 	  	  int ctr;
				
				ctr = start;
				while( ctr <= stop)
				{
					System.out.println(ctr + " ");
					ctr = ctr + 1;
					
					{
				
				return;
					}
				}
		 	  }
					
				}
		 	
				
				
				

		 	 
		 	  
		 	  
		 	
		 	 
		 	 
		 	 
		 

		
		 		public static int abso(String[] args)
		 		{
		 		//parameters are:
		 		  int value = 0 ;
		 		  {
		 		  
		 		  //find the absolute value of the parameter
		 		   int absval;
		 		   
		 		   if( value < 0)
		 		   	absval = -value;
		 		   else 
		 		   		absval = value;
		 		  }
		 		   		
		 		   		return value;
		 		}
}
		 		   		
		 		   		
		 		

		 		   
		 		  
		 		 
			 
		 	 
		 
		 
	 
	 	 
		
	


