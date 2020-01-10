import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		final String MESSAGE = "Hello there";
		
	
		
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter Miles:  ");
			double miles = sc.nextDouble();
			System.out.print("Enter MPH:    ");
			double mph = sc.nextDouble();
			
			// calculate hours as a double
			double hours = miles / mph;
			
			// total minutes as an int
			int minutes = (int) (hours * 60);
			int hoursInt = minutes / 60;
			
			// convert the minutes to the remaining minutes
			minutes = minutes % 60;
			
			System.out.println("Estimated Travel Time");
			System.out.println("---------------------");
			System.out.println("Hours:   "+hoursInt);
			System.out.println("Minutes: "+minutes);
			
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye");
	}

}
