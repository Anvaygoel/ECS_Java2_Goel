import java.util.Scanner;

public class FindingPrimes{
  public static void main(String[] args)
  {
	  
	  
	  Scanner keyboard = new Scanner(System.in);
	  System.out.println("We are going to find some primes!");
	  System.out.println("What range would you like them in?");
	  System.out.println("(Only positive intergers 2 or greater)");
	  
	  System.out.println("Low End");
	  
	  int Low = keyboard.nextInt();
	
	  System.out.println("High end");
	  int high = keyboard.nextInt();
	  
	  
	  for (int i=Low; i<=high; i++)
	  {
		  
		  if (isPrime(i))
		  {
			  
      
			  System.out.println(i + "<");
			  
			  
			
			  
			  
				  
				  
				 
			  
		  }
		  else
		  {
			  System.out.println(i );
		  }
      
	  }
    
  }  
  
  public static boolean isPrime(int i){
	  for( int x = 2; x < i; x++)
	  {
		  if ( i%x ==0)
		  {
		  return false;
		  }
		  
	  }
	  	return true;
  }
}
