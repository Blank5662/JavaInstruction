import java.util.Scanner;

public class gradeConverter {

	public static void main(String[] args) {
		// Welcome the user
		System.out.println("Welcome to the Letter Grade Converter");

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt user input
			System.out.println("Enter numerical grade: ");
			int numericalGrade = sc.nextInt();

			// business logic
			String letterGrade;
			if (numericalGrade <= 100 && numericalGrade >= 88) {
				letterGrade = "A";
			} else if (numericalGrade <= 87 && numericalGrade >= 80) {
				letterGrade = "B";
			} else if (numericalGrade <= 79 && numericalGrade >= 67) {
				letterGrade = "C";
			} else if (numericalGrade <= 66 && numericalGrade >= 60) {
				letterGrade = "D";
			} else {
				letterGrade = "F";
			}
			// display results
			System.out.println("Letter Grade: " + letterGrade);

			System.out.println("Continue?(y/n) ");
			choice = sc.next();

		}

		// goodbye
		System.out.println("Bye!!");

	}

}
