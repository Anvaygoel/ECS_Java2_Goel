import java.util.Scanner;

public class SpaceWeight 
{
	

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int planet;
		double weight;
		double Venus, mars, jupiter, saturn, uranus, neptune;
		
		Venus = .78;
		mars = .39;
		jupiter = 2.65;
		saturn = 1.17;
		uranus = 1.05;
		neptune = 1.23;
		
		
		System.out.println("Please enter your current earth weight");
		weight = keyboard.nextInt();
		
		
		System.out.println(" i have the information for the following planets:");
		System.out.println(" 1. Venus   2. Mars  3. Jupiter");
		System.out.println(" 4. saturn  5. uranus  6. Neptune");
		
		System.out.println(" Which planet are you visiting? ");
		planet = keyboard.nextInt();
		
		if (planet >0&&planet<2)
		{
			System.out.println("Your weight would be " + (weight*Venus) + "pounds on that planet." );
		}
		if (planet >1&&planet<3)
		{
			System.out.println("Your weight would be " + (weight*mars) + "pounds on that planet." );
		}
		if (planet >2&&planet<4)
		{
			System.out.println("Your weight would be " + (weight*jupiter) + "pounds on that planet." );
		}
		if (planet >3&&planet<5)
		{
			System.out.println("Your weight would be " + (weight*saturn) + "pounds on that planet." );
		}
		if (planet >4&&planet<6)
		{
			System.out.println("Your weight would be " + (weight*uranus) + "pounds on that planet." );
		}
		if (planet >5&&planet<7)
		{
			System.out.println("Your weight would be " + (weight*neptune) + "pounds on that planet." );
		}
	}

}
