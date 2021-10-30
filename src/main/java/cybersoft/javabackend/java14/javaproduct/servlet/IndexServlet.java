package cybersoft.javabackend.java14.javaproduct.servlet;

import java.io.IOException;

import cybersoft.javabackend.java14.javaproduct.service.Product;
import cybersoft.javabackend.java14.javaproduct.service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="index", urlPatterns = {
		""
})
public class IndexServlet extends HttpServlet{
	ProductService productService = new ProductService();
	Product product;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("index.jsp")
			.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String desc = req.getParameter("description");
		Float price = Float.parseFloat(req.getParameter("price")) ;
		Integer quantity = Integer.parseInt(req.getParameter("quantity")) ;
		
		product = new Product(name, desc, price, quantity);
		productService.addProduct(product);
	}
}
