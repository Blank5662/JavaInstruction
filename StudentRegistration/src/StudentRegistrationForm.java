import java.util.Scanner;

public class StudentRegistrationForm {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Student Registration Form");
		
		Scanner sc = new Scanner(System.in);
		// define user input
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		System.out.println("Enter last name: ");
		String lastName = sc.next();		
		System.out.println("Enter year of birth: ");
		int birthYear = sc.nextInt();
		
		System.out.println("Welcome"+" "+firstName+" "+lastName+"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+firstName+"*"+birthYear);
		
		
	}

}
