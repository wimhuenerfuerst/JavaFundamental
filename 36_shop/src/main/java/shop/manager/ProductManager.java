package shop.manager;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import shop.product.Product;

@Component
public class ProductManager {

	Product[] products = {};

	public Product[] getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products = Arrays.copyOf(products, products.length + 1);
		products[products.length - 1] = product;
	}

	public int resolveProductId(Product product) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].equals(product)) {
				return i;
			}
		}

		return -1;
	}

	public Product resolveProduct(int productId) {
		return products[productId];
	}
}
