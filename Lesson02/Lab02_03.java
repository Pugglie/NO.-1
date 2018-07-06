//Rebecca Wei
//7-5-18
import java.util.Scanner;

public class Lab02_03{
	public static void main (String[] args){
		//scanner setup
		Scanner userInput = new Scanner(System.in);
		
		//asking for the numbers
		System.out.print("What would you like your first number to be:: ");
		int firstNumber = userInput.nextInt ();
		System.out.print("What would you like your second number to be:: ");
		int secondNumber = userInput.nextInt ();
		
		//multiplying the numbers together
		System.out.print("Answer:: "); 
		System.out.print(firstNumber*secondNumber);
	}
}
