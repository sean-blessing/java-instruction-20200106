
public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public Contact() {
		super();
	}

	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void displayContact() {
		String display = "--------------------------\n" +
						 "---- Current Contact -----\n" +
						 "--------------------------\n" +
						 "Name:          "+firstName+ " " +lastName+"\n" +
						 "Email Address: "+email + "\n" +
						 "Phone Number:  "+phone + "\n" +
						 "--------------------------\n";
		System.out.println(display);
	}

	
	
	
	
	
	
	
	
	
	
}
