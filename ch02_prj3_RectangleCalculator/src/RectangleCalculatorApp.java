import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Rectangle Calculator App!");
		
		Scanner sc = new Scanner(System.in); 
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
			// Prompt for user input
			System.out.print("Enter Length: ");
			double length = sc.nextDouble();
			System.out.print("Enter Width: ");
			double width = sc.nextDouble();
			
		
			// Business logic
			double area = width * length;
			double perimeter = 2 * width + 2 * length;
		
		
			// Display results
			System.out.println("area = "+area);
			System.out.println("perimeter = "+perimeter);
		
		System.out.println("Continue?(y/n) ");
		choice = sc.next();
		}
		// Bye
		System.out.println("Goodbye");

	}

} 
