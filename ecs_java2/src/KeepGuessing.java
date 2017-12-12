import  java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{
public static void main(String[] args)
{
	
	Scanner keyboard = new Scanner(System.in);
 	Random r = new Random();
int random = r.nextInt(10);


	System.out.println(" I have chosen a number between 1 and 10. Try to guess it. ");
	int numG = keyboard.nextInt();
	System.out.println("Your guess:");
    System.out.println(numG);

while ( numG != random)
{
	System.out.println("That is incorrect. Guess again");
System.out.println("Your guess: ");
numG = keyboard.nextInt();




}

	System.out.println("That’s correct! You’re a good guesser.");

}
}
