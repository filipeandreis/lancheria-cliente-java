package Controllers;

import Models.Product;
import Views.ViewProduct;

public class ProductController {
	public Product newProduct() {
		new ViewProduct();
		
		String product = ViewProduct.setDescription();
		Double price = ViewProduct.setPrice();
		
		Product product1 = new Product(1, product, price);
		
		return product1;
	}
}