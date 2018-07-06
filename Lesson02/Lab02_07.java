import java.util.Scanner;

public class Lab02_07{
	public static void main (String[] args){
		//scanner setup
		Scanner userInput = new Scanner (System.in);
		
		//intro
		System.out.println("You are trying to find the surface area of a cylinder.");
		//finding the dimensions of the cylinder
		System.out.print("What is the radius of the base:: ");
		double radius = userInput.nextDouble ();
		System.out.print("What is the height of the cylinder:: ");
		double height = userInput.nextDouble ();
		
		//surface area of base
		final double PI =  3.141592654;
		double base = (radius * radius) * PI;
		//surface area of side
		double circumference = (2 * radius) * PI;
		double side = circumference * height;
		
		//surface area of whole cylinder
		System.out.print("\nThis is the surface area of your cylinder:: ");
		System.out.print(base+base+side);
	}
}	