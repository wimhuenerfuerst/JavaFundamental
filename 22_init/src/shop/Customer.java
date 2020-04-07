package shop;

public class Customer {
	
	{
		address = "";
		houseNumber = "";
		
		System.out.println("");
	}

	String knr;
	String firstName;
	String lastName;
	String address; // = "default 2";
	String houseNumber;
	
	{
		//address = "default 3";
	}

	public Customer(String firstName, String lastName) {
		this.knr = firstName + lastName;
		this.firstName = firstName;
		this.lastName = lastName;
		
		init();
	}
	
	public Customer(String knr, String firstName, String lastName) {
		this.knr = knr;
		this.firstName = firstName;
		this.lastName = lastName;	
		
		init();
	}
	
	private void init() {
		address = "";
		houseNumber = "";
	}

	@Override
	public String toString() {
		return "Customer [knr=" + knr + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}

	public static void main(String[] args) {
		Customer customer = new Customer("1", "Hans", "Peter");
		System.out.println(customer);
	}

}
