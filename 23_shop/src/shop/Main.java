package shop;

import java.util.UUID;

import shop.customer.Account;
import shop.customer.BankPaymentMethod;
import shop.customer.Customer;
import shop.customer.CustomerAddress;
import shop.manager.CartManager;
import shop.manager.ProductManager;
import shop.order.Order;
import shop.product.Product;

public class Main {

	public static void main(String[] args) {
		Product bier = new Product(UUID.randomUUID().toString(), "Bier", 1.23, 19);
		Product schnaps = new Product(UUID.randomUUID().toString(), "Schnaps", 10.23, 19);

		ProductManager.getInstance().addProduct(bier);
		ProductManager.getInstance().addProduct(schnaps);

		CustomerAddress address = new CustomerAddress("teststr", "12345", "my place", "germany");
		BankPaymentMethod paymentMethod = new BankPaymentMethod("DE123456789", "123456789", "Test Bank");
		Customer customer = new Customer(1, "hans@hans.de", paymentMethod, address);
		Account account = new Account("hans", "password1", customer);

		CartManager cartManager = CartManager.getInstance();
		cartManager.create(account);
		cartManager.addItem(10, bier);
		cartManager.addItem(20, schnaps);
		Order order = CartManager.getInstance().checkout();

		System.out.println(order);
	}

}
