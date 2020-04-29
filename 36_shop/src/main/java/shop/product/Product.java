package shop.product;

import java.util.Arrays;

public class Product {
	String uuid;
	String name;
	double price;
	int vat;
	ProductProperty[] productProperties = {};

	public Product(String uuid, String name, double price, int vat) {
		super();
		this.uuid = uuid;
		this.name = name;
		this.price = price;
		this.vat = vat;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ProductProperty[] getProductProperties() {
		return productProperties;
	}

	public void setProductProperties(ProductProperty[] productProperties) {
		this.productProperties = productProperties;
	}

	public void addProductProperty(ProductProperty property) {
		productProperties = Arrays.copyOf(productProperties, productProperties.length + 1);
		productProperties[productProperties.length - 1] = property;
	}

}
