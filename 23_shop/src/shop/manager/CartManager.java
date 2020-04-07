package shop.manager;

import java.time.LocalDateTime;

import shop.cart.Cart;
import shop.cart.CartItem;
import shop.customer.Account;
import shop.order.Order;
import shop.product.Product;

public class CartManager {
	private static CartManager instance = new CartManager();

	Cart cart;

	public static CartManager getInstance() {
		return instance;
	}

	private CartManager() {

	}

	public void create(Account account) {
		cart = new Cart(LocalDateTime.now(), account);
	}

	public void addItem(int qty, Product product) {
		CartItem cartItem = new CartItem(qty, product);
		cart.addCartItem(cartItem);
	}

	public Order checkout() {

	}
}
