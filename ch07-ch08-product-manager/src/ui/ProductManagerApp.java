package ui;
import business.*;

public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the product manager");
		Book p1 = new Book("java", "Murach's Java Programming",
				59.50, "Joel Murach");
		System.out.println("p1 code = "+p1.getCode());
		System.out.println("p1 desc = "+p1.getDescription());
		System.out.println("p1 price = "+p1.getPrice());
		
		Book p2 = new Book();
		p2.setCode("java");
		p2.setDescription("Murach's Java Programming");
		p2.setPrice(59.50);
		p2.setAuthor("Joel Murach");
		
		System.out.println("p2 toString() = "+p2);
		System.out.println(p2.getDisplayText());
		p2.print();
		
		if (p1.equals(p2)) {
			System.out.println("p1 and p2 are the same");
		}
		else {
			System.out.println("p1 and p2 are NOT the same");
		}
		
		Product p;
		Printable printable;
		
		p = p2;
		
		System.out.println("p tostring - "+p);
		
		printable = p2;
		
		System.out.print("printable print - ");
		printable.print();
		
		System.out.println("bye");
		
		
		
		
		
		
	}

}
