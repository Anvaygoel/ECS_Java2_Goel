
public class MoreVariablesAndPrinting 
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHieght, myWieght;
		
		
		myName="Anvay Goel";
		myAge= 15;
		myHieght = 64;  //inches
		myWieght= 120;  //
		myEyes= "brown";
		myTeeth= "White";
		myHair = "Black";
		
		System.out.println("Let's talk about " + myName + "." );
		System.out.println("He's " + myHieght + " inches tall.");
		System.out.println("He's " + myWieght + " pounds heavy");
		System.out.println("Acually, that's not to heavy.");
		System.out.println("he's got " + myEyes + " Eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + "depending on all the coffe.");
		System.out.println("If I add " + myAge + "," + myHieght + "," + myWieght + " I get " + (myAge + myHieght + myWieght) + ".");
		
	}

}
