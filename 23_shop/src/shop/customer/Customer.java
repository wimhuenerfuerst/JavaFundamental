package shop.customer;

public class Customer {
	int id;
	String email;
	BankPaymentMethod paymentMethod;
	CustomerAddress address;

	public Customer(int id, String email, BankPaymentMethod paymentMethod, CustomerAddress address) {
		super();
		this.id = id;
		this.email = email;
		this.paymentMethod = paymentMethod;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BankPaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(BankPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

}
