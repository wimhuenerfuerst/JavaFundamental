package shop.order;

public class OrderItem {
	String productId;
	String name;
	int quantity;
	double price;
	int vat;

	public OrderItem(String productId, String name, int quantity, double price, int vat) {
		super();
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.vat = vat;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	@Override
	public String toString() {
		return "OrderItem [productId=" + productId + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", vat=" + vat + "]";
	}

}
