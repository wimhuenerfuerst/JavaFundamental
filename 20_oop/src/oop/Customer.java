package oop;

import java.util.Arrays;

public class Customer {

	Address address;
	String name;
	int kdnr;
	Order[] orders = {};

	public void init(int kdnr, String name, Address address) {
		this.kdnr = kdnr;
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getKdnr() {
		return kdnr;
	}

	public Address getAddress() {
		return address;
	}

	public void addOrder(Order order) {
		orders = Arrays.copyOf(orders, orders.length + 1);
		orders[orders.length - 1] = order;
	}

	public Order[] getOrders() {
		return orders;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", kdnr=" + kdnr + "]";
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		Address address = new Address();
		address.init(1234, "Egal");

		customer.init(1, "Hans Peter", address);

		System.out.println(customer.getKdnr());
		System.out.println(customer.getName().toUpperCase());
		System.out.println(customer.getAddress());

		System.out.println(Arrays.toString(customer.getOrders()));

		Order order1 = new Order();
		order1.setProductName("Eis");
		order1.setQty(1);

		customer.addOrder(order1);
		System.out.println(Arrays.toString(customer.getOrders()));

		Order order2 = new Order();
		order2.setProductName("Bier");
		order2.setQty(10);

		customer.addOrder(order2);
		System.out.println(Arrays.toString(customer.getOrders()));
	}
}
