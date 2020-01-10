import java.util.Scanner;

public class Chapter1DemosApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		int a = 5;
		System.out.print("Enter a interger:  ");
		int b = sc.nextInt();
		int sum = a + b;
		
		System.out.println("Sum: "+sum);
		
		System.out.println("Enter a decimal: ");
		double d = sc.nextDouble();
		
		double product = a * d;
		
		System.out.println("Product: "+product);
		
		int product2 = a * (int)d;
		double product3 = a * d;
		
		//define a counter
		int i = 1;
		// increment by 1
		i = i + 1;
		// increment by 1 again
		i += 1;
		// increment by 5
		i += 5;
		
		// increment by 1, unary operator
		i++;
	
		System.out.println("Bye");
		sc.close();
	}

}
