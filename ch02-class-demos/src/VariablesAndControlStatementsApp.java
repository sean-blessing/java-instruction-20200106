import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class VariablesAndControlStatementsApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Scanner sc = new Scanner(System.in);
//		double quotient = 0;
//		
//		System.out.print("Enter a numerator: ");
//		double a = sc.nextDouble();
//		
//		System.out.print("Enter a denominator: ");
//		double b = sc.nextDouble();
//		
//		System.out.println("Quotient = " + (a / b));
//		System.out.println("Remainder = " + (a % b));
//		
//		// String variables
//		String fName = "Bob";
//		String lName = "Marley";
//		//String fullName = fName + " " + lName;
//		String fullName = "";
//		fullName += fName;
//		fullName += " ";
//		fullName += lName;
//		System.out.println("full name = "+fullName);
//		
//		//new line
//		String message = "My name is\n"+fullName;
//		// tab
//		message = "My name is\t"+fullName;
//		System.out.println(message);
//		// quotes
//		message = "My name is \""+fullName+"\"";
//		System.out.println(message);
//		
//		// Date and NumberFormat classes
//		LocalDate ld = LocalDate.now();
//		Date now = new Date();
//		NumberFormat nf = NumberFormat.getCurrencyInstance();
//		
//		System.out.println("Local Date = "+ld);
//		System.out.println("Date = "+now);
//		
//		double price = 35400.99;
//		System.out.println("price = "+price);
//		System.out.println("formatted price = "+nf.format(price));
//		
//		// Get String input from console
//		sc.nextLine();
//		String sentence = "";
//		System.out.print("Enter a sentence: ");
//		sentence = sc.nextLine();
//		System.out.println("sentence: "+sentence);
//		
//		System.out.print("Enter a word:");
//		String word = sc.next();
//		System.out.println("word = "+word);
		
		// demo if and while
		double spend = 500;
		
		if (spend > 500) {
			System.out.println("spend greater than 500");
		}
		else if (spend > 200) {
			System.out.println("spend greater than 200");
		}
		else {
			System.out.println("spend less than 201");
		}
		
		int a = 50;
		if (a <=5) {
			System.out.println("a <=5");
		}
		else if (a > 5) {
			System.out.println("a > 5");
		}
		else if (a > 10) {
			System.out.println("a > 10");
		}
		
		// while loop - string
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("choice is 'y'!");
			System.out.println("continue? (y/n)");
			choice = sc.next();
		}
		
		int n = 10;
		while (n > 0) {
			System.out.println("n is "+n);
			n--;
		}
		
		System.out.println("Enter an integer: ");
		int i = sc.nextInt();
		
		System.out.println("i = "+i);
		
		
		System.out.println("Bye");
	}

}
