//Rebecca Wei
//7-5-18
import java.util.Scanner;

public class Ultimate_Calculator{
	public static void main (String[] args){
		
		//Scanner setup
		Scanner userInput = new Scanner (System.in);
		
		//asking for the numbers and the operation
		System.out.print("Please insert a number:: ");
		double first = userInput.nextDouble ();
		System.out.print("Please insert another number:: ");
		double second = userInput.nextDouble ();
		String random = userInput.nextLine ();
		System.out.print("What operation would you like to perform (addition, subtraction, multiplication, division):: ");
		String operation = userInput.nextLine ();
		
		
		//performing addition
		if (operation.equalsIgnoreCase("addition")){
			System.out.println("The sum of your numbers are :: " + (first+second));
		} else if (operation.equalsIgnoreCase("subtraction")){//performing subtraction
			System.out.println("The difference of your numbers are:: " + (first-second));
		}else if (operation.equalsIgnoreCase("multiplication")){//performing multiplication
			System.out.println("The product of your numbers are:: " + (first*second));
		}else if (operation.equalsIgnoreCase("division")){//performing division
			System.out.println("The quotient of your two numbers is:: " + (first/second));
		}
	}
}	
