<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2 class="text-primary mx-auto">Add Product</h2>
		<form action="" method="post">
		<div class="form-group">
			<label>Name:</label>
			<input class="form-control" type="text" name=name />
		</div>
		<div class="form-group">
			<label>Description:</label>
			<input class="form-control" type="text" name="description" />
		</div>
		<div class="form-group">
			<label>Price:</label>
			<input class="form-control" type="text" name="price" />
		</div>
		<div class="form-group">
			<label>Quantity:</label>
			<input class="form-control" type="text" name="quantity" />
		</div>
		<input class="form-control text-light bg-success" type="submit" value="Add Product" />
		</form>
	</div>
	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>