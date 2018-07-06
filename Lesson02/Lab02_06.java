import java.util.Scanner;

public class Lab02_06{
	public static void main (String[] args){
		//scanner setup
		Scanner userInput = new Scanner (System.in);
		
		//intro
		System.out.println("You are trying to find the volume of a cylinder.");
		//finding the cylinder dimensions
		System.out.print("What is the radius of the base:: ");
		double radius = userInput.nextDouble ();
		System.out.print("What is the height of the cylinder:: ");
		double height = userInput.nextDouble ();
		
		//the base of the cylinder
		final double PI = 3.141592654;
		double basearea = (radius*radius)* PI;
		System.out.println("The approximate volume of your cylinder is:: " + basearea*height);
	}
}	