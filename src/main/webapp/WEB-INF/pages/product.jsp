<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Product page</h1>
		
		 <table class="table mt-3">
          <thead>
            <tr>
              <th>Name</th>
              <th>Description</th>
              <th>Price</th>
              <th>Stock</th>
              <th>#</th>
            </tr>
          </thead>
          <tbody>
          	<c:forEach var="product" items="${products }">
	            <tr>
	              <td scope="row"><input name="removeProduct" value="${product.name }" class="d-none">${ product.name }</td>
	              <td>${ product.description }</td>
	              <td>${ product.price }</td>
	              <td>${ product.quantity }</td>
	              <td>
	              	<a class="btn btn-danger" href="products/remove?name=${product.name }">Remove</a>
	              </td>
	            </tr>
          	</c:forEach>
          </tbody>
        </table>
        
        <a class="btn btn-success" href="/Java14Product/products/add" >Add New Product</a>
	</div>	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>