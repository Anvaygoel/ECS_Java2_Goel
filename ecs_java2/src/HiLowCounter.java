import java.util.Random;
import java.util.Scanner;

public class HiLowCounter{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int number = r.nextInt(100);
		
		int num;
		
		int tries = 0;
		
		tries++;
		
		System.out.println("I am thinking of a number from 1 - 100. Can you guess it?");
		
		num = sc.nextInt();
		
		System.out.println("Guess #" + tries + ": " + num);
		
		if(num > number) {
			System.out.println("TOO HIGH");
		}
		
		if(num < number) {
			System.out.println("TOO LOW");
		}
		
		while(tries <= 6) {
			tries++;
			
			num = sc.nextInt();
					
			System.out.println("Guess #" + tries + ": " + num);
		
			if(num > number) {
				System.out.println("TOO HIGH");
			}
			
			if(num < number) {
				System.out.println("TOO LOW");
			}
			
			if(num == number) {
				System.out.println("Congrats! You got it! What are the odds?");
			}
			
			if(tries >= 7) {
				System.out.println("Sorry! You ran out of tries!");
				System.out.println("The number was " + number + ".");
			}
		}
	}
}
