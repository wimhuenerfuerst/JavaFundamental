package oop;

public class Order {

	String productName;
	int qty;

	public String getProductName() {
		return productName;
	}

	public int getQty() {
		return qty;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Order [productName=" + productName + ", qty=" + qty + "]";
	}
}
