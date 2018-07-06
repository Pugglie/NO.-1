import java.util.Scanner;

public class Lab02_Challenge{
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
		double BMI = weightbyheight*conversionvalue;
		System.out.println(fullname + ", your BMI is:: " + BMI);
		
		//Underweight BMI
		if (BMI<18.5) {
			System.out.println("You are underweight. I suggest eating more.");
		}
		//Healthy BMI 
		if (BMI>18.5 && BMI<29.9){
			System.out.println("Congratulations! You are of a healthy BMI!:)");
		}
		//Obese BMI
		if (BMI>30.0){
			System.out.println("You are OBESE...");
		}	
	}	
}		