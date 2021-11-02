<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cybersoft.javabackend.java14.javaproduct.service.ProductService" %>
<%@ page import="cybersoft.javabackend.java14.javaproduct.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
</head>
<body>
	<h1>Welcome</h1>
	<%! ProductService productService = new ProductService(); %>
	<table>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Quantity</th>
		</tr>		
	<%for(Product product: productService.getProducts()){%>
		<tr>
			<td><%= product.getName()%></td>
			<td><%= product.getDescription() %></td>
			<td><%= product.getPrice() %></td>
			<td><%= product.getQuantity() %></td>
		</tr>
	<%};%>
	</table>
	<a href="/Java14Product/addProduct">Add Product</a>
</body>
</html>