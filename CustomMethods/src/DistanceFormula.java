
public class DistanceFormula 
{
	public static void main(String[] args)
	{
		// test the formula bit
		double d1 = distnace(-2,1 , 1,5);
		System.out.println(" (-2, 1) to (1,5) => " + d1);
		
		double d2 = distnace(-2, -3 , -4,4);
		System.out.println(" (-2, -3) to (-4,4) "+ d2);
		int value = 0;
		double root = Math.sqrt(value); double absolute = Math.abs(value); 
		System.out.println("( 2, -3) to (-1,-2) => " + distnace(2, -3,-1,-2));
		
		System.out.println(" (4,5) to (4,5) => " + distnace(4,5,4,5));
	}
	public static double distnace ( int x1, int y1, int x2, int y2)
	{
		double a, b , c;
		a = x2-x1;
		a=Math.pow(a, 2);
		b=y2-y1;
		b=Math.pow(b, 2);
		c=a+b;
		c=Math.sqrt(c);
		return c;
		
	}
	

}
