import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num, count, CountBy;
		
		System.out.println("Count from: ");
		num = keyboard.nextInt();
		
		System.out.println("Count to: ");
		count = keyboard.nextInt();
		
		System.out.println(" Count by: ");
		CountBy = keyboard.nextInt();
		
		
		for ( int n = num ; n <= count ; n = n + CountBy)
		{
			System.out.print(n + " ");
		}
	}

}
