package shop.manager;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import shop.cart.Cart;
import shop.cart.CartItem;
import shop.customer.Account;
import shop.customer.BankPaymentMethod;
import shop.customer.Customer;
import shop.customer.CustomerAddress;
import shop.order.Order;
import shop.order.OrderAddress;
import shop.order.OrderItem;
import shop.order.OrderPaymentMethod;
import shop.product.Product;

@Component
public class CartManager {

	@Autowired
	ProductManager productManager;

	Cart cart;

	public void create(Account account) {
		cart = new Cart(LocalDateTime.now(), account);
	}

	public void addItem(int qty, Product product) {
		CartItem cartItem = new CartItem(qty, product);
		cart.addCartItem(cartItem);
	}

	public Order checkout() {
		Customer customer = cart.getCreatedBy().getCustomer();
		BankPaymentMethod bankPaymentMethod = customer.getPaymentMethod();

		OrderPaymentMethod orderPaymentMethod = new OrderPaymentMethod(bankPaymentMethod.getIban(),
				bankPaymentMethod.getBic(), bankPaymentMethod.getBankName());

		CustomerAddress customerAddress = customer.getAddress();

		OrderAddress orderAddress = new OrderAddress(customerAddress.getStreet(), customerAddress.getZip(),
				customerAddress.getPlace(), customerAddress.getCountry());

		String orderNumber = UUID.randomUUID().toString();

		Order order = new Order(orderNumber, LocalDateTime.now(), orderAddress, orderPaymentMethod);

		for (CartItem cartItem : cart.getCartItems()) {
			Product product = cartItem.getProduct();

			int productId = productManager.resolveProductId(product);
			OrderItem orderItem = new OrderItem("" + productId, product.getName(), cartItem.getQuantity(),
					product.getPrice(), product.getVat());

			order.addOrderItem(orderItem);
		}

		return order;

	}
}
