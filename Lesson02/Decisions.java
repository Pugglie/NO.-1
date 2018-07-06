import java.util.Scanner;

public class Decisions {
	public static void main(String[] args){
		 Scanner userInput = new Scanner (System.in);
		
		System.out.print("Please insert a number:: ");
		int number = userInput.nextInt();
		
		if (number == 1) {
			System.out.println("Hey this number is one!!!! Big Surprise.");
		}
		else if (number == 2){
			System.out.println("Hey this number is two!!!! Big Surprise.");
		}else{
			System.out.println("Hey this number isn't one OR two!!");
		}
		
		 double E = 2.718281;
		System.out.println(E);
		System.out.printf("%.104f", E); 
		
		System.out.println(5/3);
		System.out.println(5%3);
	}
}