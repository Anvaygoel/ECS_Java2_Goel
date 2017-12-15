import java.util.Scanner;

public class AreaCalculatorRepeat{
	static Scanner sc = new Scanner(System.in);
	static int shapeNum;
	
	public void triangle()  {
		int base, height;
		System.out.println("Base: ");
		base = sc.nextInt();
		System.out.println("Height: ");
		height = sc.nextInt();
		System.out.println("The area is: " + (.5 * base * height));
	}
	
	public void rect() {
		int length, width;
		System.out.println("Length: ");
		length = sc.nextInt();
		System.out.println("Width: ");
		width = sc.nextInt();
		System.out.println("The area is " + (length * width));
	}
	
	public void square() {
		int side;
		System.out.println("Side: ");
		side = sc.nextInt();
		System.out.println("Area:" + (side * side));
	}
	
	public void circle() {
		int pi, radius;
		System.out.println("Radius: ");
		radius = sc.nextInt();
		System.out.println("Area:" + (3.14 * radius * radius));
	}
	
	public void initSetup() {
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.println("Which shape: ");
		shapeNum = sc.nextInt();
		
		if(shapeNum == 1) {
			triangle();
		}
		
		if(shapeNum == 2) {
			rect();
		}
		
		if(shapeNum == 3) {
			square();
		}
		
		if(shapeNum == 4) {
			circle();
		}
		
		if (shapeNum == 5) {
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		AreaCalculatorRepeat a = new AreaCalculatorRepeat();
		
		a.initSetup();
	}
}
