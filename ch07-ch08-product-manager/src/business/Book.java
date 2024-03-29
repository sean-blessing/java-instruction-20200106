package business;

public final class Book extends Product implements Printable{
	private String author;

	public Book() {
		super();
	}

	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String getDisplayText() {
		return getDescription() + " by "+ author;
	}

	@Override
	public void print() {
		System.out.println("Hey, I'm printing something!!!");
		
	}
	
	

}
