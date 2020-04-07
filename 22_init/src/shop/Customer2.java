package shop;

public class Customer2 {

	String knr;
	String firstName;
	String lastName;
	String address;

	/*
	 * public Customer() { System.out.println("new customer"); }
	 */

	public Customer2(String knr, String firstName, String lastName) {
		this.knr = knr;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getKnr() {
		return knr;
	}

	public void setKnr(String knr) {
		this.knr = knr;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [knr=" + knr + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}

	public static void main(String[] args) {
		Customer2 customer = new Customer2("1", "Hans", "Peter");
		customer.setAddress("Frankfurterstr 123");
		System.out.println(customer);
	}

}
