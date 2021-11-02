package cybersoft.javabackend.java14.javaproduct.service;

import java.util.LinkedList;
import java.util.List;

import cybersoft.javabackend.java14.javaproduct.model.Product;

public class ProductService {
	private List<Product> products;
	
	public ProductService() {
		products = new LinkedList<Product>();
		
		products.add(new Product("Áo sơ mi", "LV", 30000f, 5));
		products.add(new Product("Quần", "Gucchi", 45000f, 5));
		products.add(new Product("Giày", "Converse", 30000f, 5));
	}
	
	public boolean addProduct(Product product) {
		if (product == null) {
			return false;
		}
		/* check duplicated */
		for (Product p: products) {
			if(product.getName().equalsIgnoreCase(p.getName())) {
				return false;
			}
		}
		
		return this.products.add(product);
	}
	
	public boolean removeProduct(String productName) {
		if(productName == null || "".equals(productName)) {
			return false;
		}
		for(Product p: products) {
			if(p.getName().equalsIgnoreCase(productName)) {
				products.remove(p);
				return true;
			}
		}
		return false;
	}
	public List<Product> getProducts(){
		return this.products;
	}
}
