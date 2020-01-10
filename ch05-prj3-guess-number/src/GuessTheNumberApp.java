import java.util.Scanner;

public class GuessTheNumberApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number App:");
		
		// initialize variables
		Scanner sc = new Scanner(System.in);
		final int LIMIT = 100;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int count = 0;
			int rnd = generateRandomNumber(LIMIT);
			int guess = 0;
			System.out.println("I'm thinking of a random number between 1 and "+LIMIT+".");
			System.out.println("Try to guess it!");
			
			while (guess != rnd) {
				guess = getIntWithinRange(sc, "Enter number: ", 0, 101);
				count++;
				int diff = guess - rnd;
				String message = "";
				
				if (diff > 10) {
					// wth
					message += "Way too high!  Guess again.";
				}
				else if (diff > 0) {
					//th
					message += "Too high!  Guess again.";
				}
				else if (diff < -10) {
					//wtl
					message += "Way too low!  Guess again.";
				}
				else if (diff < 0) {
					//tl
					message += "Too low!  Guess again.";
				}
				else {
					// correct guess!
					message += "You got it in "+count+" tries!\n";
					if (count <= 3) {
						message += "Great work!  You are a mathematical wizard!!";
					}
					else if (count <= 7) {
						message += "Not bad!  You've got some potential.";
					}
					else {
						message += "What took you so long?  Maybe you should take some lessons.";
					}
				}
				System.out.println(message);
			}

			System.out.print("Continue? (y/n)");
			choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

	private static int generateRandomNumber(int limit) {
		int rnd = (int)(Math.random() * limit) + 1;
		return rnd;
	}
	
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

	
	
	
}
