import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationsApp {

	public static void main(String[] args) {
		printHello();
		

//		System.out.print("a");
//		System.out.print("b");
//		System.out.print("c");
		Scanner sc = new Scanner(System.in);

		int n1 = getInt("Enter an integer: ", sc);
		int n2 = getInt("Enter another integer: ", sc);

		int sum1 = n1 + n2;
		System.out.println("Sum = " + sum1);

		int n3 = getInt("Enter an integer: ", sc);
		int n4 = getInt("Enter another integer: ", sc);

		int sum2 = n3 + n4;
		System.out.println("Sum = " + sum2);

		System.out.println("Bye");

	}

//	private static int getInt(String prompt, Scanner sc) {
//		int n = 0;
//		while (true) {
//			try {
//				System.out.print(prompt);
//				n = sc.nextInt();
//				break;
//			} catch (InputMismatchException ime) {
//				System.out.println("Invalid entry, try again.");
//				sc.nextLine();
//				continue;
//			}
//		}
//		return n;
//	}

	private static int getInt(String prompt, Scanner sc) {
		int n = 0;
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				break;
			} else {
				System.out.println("Invalid entry, try again.");
				sc.nextLine();
				continue;
			}
		}
		return n;
	}

	private static void printHello() {
		System.out.println("Hello");
	}

}
