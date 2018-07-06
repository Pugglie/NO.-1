import java.util.Scanner;

public class Lab02_05{
	public static void main (String[] args){
		//scanner setup
		Scanner userInput = new Scanner(System.in);
		
		//intro
		System.out.println("This will calculate your BMI.");
		
		//asking for their name
		System.out.print("What is your name:: ");
		String fullname = userInput.nextLine ();
		
		//Asking for their height and weight
		System.out.print("What is your weight in pounds:: ");
		double weight = userInput.nextDouble ();
		System.out.print("What is you height in inches:: ");
		double height = userInput.nextDouble ();
		//conversions
		double weightbyheight = weight/(height*height);
		double conversionvalue = 703.0;
		
		//Calculate BMI
		System.out.println(fullname + ", your BMI is:: " + weightbyheight*conversionvalue);
	}	
}		