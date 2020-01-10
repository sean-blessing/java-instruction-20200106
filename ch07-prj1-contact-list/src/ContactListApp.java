import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List Application");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		System.out.println("Enter last name: ");
		String lastName = sc.next();
		System.out.println("Enter email: ");
		String email = sc.next();
		System.out.println("Enter phone: ");
		String phone = sc.next();
		
		Contact c = new Contact(firstName,lastName,email,phone);
		
		c.displayContact();
		
		System.out.println("Bye");

	}

}
