import java.util.Scanner;

public class temperatureConverter {

	public static void main(String[] args) {
		// Welcome the user
		System.out.println("Welcome to the Temperature Converter!");

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt user input
			System.out.println("Enter degrees in Fahrenheit: ");
			double fDegrees = sc.nextDouble();

			// business logic
			double cDegrees = (fDegrees - 32) * 5 / 9;
			cDegrees = (double) Math.round(cDegrees * 100) / 100;

			// display results
			System.out.println("Degrees in Celcius: " + cDegrees);

			System.out.println("Continue?(y/n) ");
			choice = sc.next();

		}

		// goodbye
		System.out.println("Bye!");

	}

}
