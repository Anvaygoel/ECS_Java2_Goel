import java.util.Random;
import  java.util.Scanner;

public class Enter
{
public static void main(String[] args)
{
	
	Scanner keyboard = new Scanner(System.in);
 	Random r = new Random();
int random = r.nextInt(10);
int counter = 0;


	System.out.println(" I have chosen a number between 1 and 10. Try to guess it. ");
	
	System.out.println("Your guess: ");
    int numG = keyboard.nextInt();
   


while ( numG !=  random)
{
	System.out.println("That is incorrect. Guess again.");
System.out.println("Your guess: ");
numG = keyboard.nextInt();
            counter++;
}

	System.out.println("That’s correct! You’re a good guesser.");
System.out.println("It took you "+ counter + " Tries .");

}
}
