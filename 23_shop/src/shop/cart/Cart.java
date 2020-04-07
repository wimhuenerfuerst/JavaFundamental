package shop.cart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import shop.customer.Account;

public class Cart {
	LocalDateTime created;
	Account createdBy;
	CartItem[] cartItems = {};

	public Cart(LocalDateTime created, Account createdBy) {
		super();
		this.created = created;
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public CartItem[] getCartItems() {
		return cartItems;
	}

	public void setCartItems(CartItem[] cartItems) {
		this.cartItems = cartItems;
	}

	public void addCartItem(CartItem cartItem) {
		cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
		cartItems[cartItems.length - 1] = cartItem;
	}
}
