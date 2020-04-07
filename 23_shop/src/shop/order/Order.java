package shop.order;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	String orderNumber;
	LocalDateTime shipped;
	OrderAddress shippedTo;
	OrderPaymentMethod paymentMethod;
	OrderItem[] orderItems = {};

	public Order(String orderNumber, LocalDateTime shipped, OrderAddress shippedTo, OrderPaymentMethod paymentMethod) {
		super();
		this.orderNumber = orderNumber;
		this.shipped = shipped;
		this.shippedTo = shippedTo;
		this.paymentMethod = paymentMethod;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDateTime getShipped() {
		return shipped;
	}

	public void setShipped(LocalDateTime shipped) {
		this.shipped = shipped;
	}

	public OrderAddress getShippedTo() {
		return shippedTo;
	}

	public void setShippedTo(OrderAddress shippedTo) {
		this.shippedTo = shippedTo;
	}

	public OrderPaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(OrderPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public OrderItem[] getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItem[] orderItems) {
		this.orderItems = orderItems;
	}

	public void addOrderItem(OrderItem orderItem) {
		orderItems = Arrays.copyOf(orderItems, orderItems.length + 1);
		orderItems[orderItems.length - 1] = orderItem;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", shipped=" + shipped + ", shippedTo=" + shippedTo
				+ ", paymentMethod=" + paymentMethod + ", orderItems=" + Arrays.toString(orderItems) + "]";
	}

}
