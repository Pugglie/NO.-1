//Rebecca Wei
//7-5-18
import java.util.Scanner;

public class Lab02_04{
	public static void main (String[] args){
		//scanner setup
		Scanner userInput = new Scanner (System.in);
		
		//asking for the numbers
		System.out.print("What would you like your first number to be:: ");
		double first = userInput.nextDouble();
		System.out.print("What would you like your second number to be:: ");
		double second = userInput.nextDouble();
		double quotient = first/second;
		
		//Dividing the numbers
		System.out.print("Asnwer:: ");
		System.out.print(quotient);
	}
}	
