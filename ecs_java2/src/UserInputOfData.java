import java.util.Scanner;

public class UserInputOfData 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, login;
		int grade, Id;
		double gpa;
		
		System.out.println("Plese enter the following information so I can sell it for profit!");
		
		System.out.println("First name: ");
		name = keyboard.next();
		
		System.out.println(" Last name: ");
		name = keyboard.next();
		
		System.out.println("Grade(9-12):");
		grade = keyboard.nextInt();
		
		System.out.println("student Id:");
		Id = keyboard.nextInt();
		
		System.out.print("Loging: ");
		login = keyboard. next();
		
		System.out.println("GPA (0.0-4.0):");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your information");
		System.out.println("Loging: " + login );
		System.out.println("ID: " + Id);
		System.out.println("Name: " + name);
		System.out.println("GPA:"  + gpa);
		System.out.println("Grade: " + grade);
		
		
		
		
		
	}

}
