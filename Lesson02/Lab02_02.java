import java.util.Scanner;

public class Lab02_02 {
	public static void main (String[] args){
		//Scanner setup
		Scanner userInput = new Scanner(System.in);
		
		//Asking for the first number
		System.out.print("What would you like your first number to be:: ");
		int firstnumber = userInput.nextInt();
		//Asking for the second number
		System.out.print("What would you like your second number to be:: ");
		int secondnumber = userInput.nextInt ();
		
		//Subtracting the two numbers
		System.out.println(firstnumber - secondnumber);
	}
}	