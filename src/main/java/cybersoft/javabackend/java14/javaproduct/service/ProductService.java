package cybersoft.javabackend.java14.javaproduct.service;

import java.util.LinkedList;
import java.util.List;

public class ProductService {
	private List<Product> products;
	
	public ProductService() {
		products = new LinkedList<Product>();
		
		products.add(new Product("Áo sơ mi", "LV", 30000f, 5));
		products.add(new Product("Quần", "Gucchi", 45000f, 5));
		products.add(new Product("Giày", "Converse", 30000f, 5));
	}
	
	public List<Product> getProducts(){
		return this.products;
	}
	public void addProduct(Product product){
		this.products.add(product);
	}
}
