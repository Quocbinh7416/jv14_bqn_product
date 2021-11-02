package cybersoft.javabackend.java14.javaproduct.servlet;

import java.io.IOException;

import cybersoft.javabackend.java14.javaproduct.model.Product;
import cybersoft.javabackend.java14.javaproduct.service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="productServlet", urlPatterns = {
		"/products",
		"/products/add",
		"/products/remove"
})
public class ProductServlet extends HttpServlet {
	private ProductService service;
	@Override
	public void init() throws ServletException {
		super.init();
		service = new ProductService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		switch (path) {
		case "/products":
			req.setAttribute("products", service.getProducts());
			req.getRequestDispatcher("/WEB-INF/pages/product.jsp")
			.forward(req, resp);
			break;
			
		case "/products/add":
			req.getRequestDispatcher("addproduct.jsp")
			.forward(req, resp);
			break;
		case "/products/remove":
			req.getRequestDispatcher("/WEB-INF/pages/product.jsp")
			.forward(req, resp);
			break;

		default:
			break;
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String desc = req.getParameter("description");
		Float price = Float.parseFloat(req.getParameter("price"));
		Integer quantity = Integer.parseInt(req.getParameter("quantity"));
		Product product = new Product(name, desc, price, quantity);
		this.service.addProduct(product);
		
		String path = req.getServletPath();
		switch (path) {	
		case "/products/add":
			resp.sendRedirect(req.getContextPath() + "/products");
			break;
		case "/products/remove":
			this.doGet(req, resp);
			break;
		default:
			break;
		}
	}
}
