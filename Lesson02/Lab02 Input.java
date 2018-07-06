import java.util.Scanner;

public class Lab02_Input {
	public static void main(String[] args) {
		//Scanner setup
		Scanner userInput = new Scanner(System.in);
		
		//Ask user for first and last name
		System.out.print("What is your first name:: ");
		String firstName = userInput.nextLine();
		System.out.print("What is you last name:: ");
		String lastName = userInput.nextLine();
		System.out.println("\nHello, " + firstName + " " + lastName + ". How are you doing?");
		
		//Ask user for age
		System.out.print("\nWhat is your age:: ");
		int age = userInput.nextInt();
		System.out.println("\nI see, " + firstName + " " + lastName +". You are " + age + " years old.");
	}
}