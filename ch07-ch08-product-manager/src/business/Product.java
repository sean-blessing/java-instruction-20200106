package business;

public abstract class Product {
	private String code;
	private String description;
	private double price;
	
	public Product() {
		super();
	}

	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean same = false;
		if (obj instanceof Product) {
			Product p2 = (Product)obj;
			if (p2.getCode().equals(code)&&
					p2.getDescription().equals(description)&&
					p2.getPrice()==price) {
				same = true;
			}
		}
		
		return same;
	}
	
	public abstract String getDisplayText();
	
	
	
	
	
	
	
	
}
