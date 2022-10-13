<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sk-Groceries-Update-Product-Price</title>
</head>
<body>
<h3>Enter the Product Id & Price to Update</h3>
<form action="updateProductRecord">
<table>
	<tr>
		<td>
			Product ID:
		</td>
		<td>
			<input type="text" name="productId">
		</td>
	</tr>
	<tr>
		<td>
			New Price:
		</td>
		<td>
			<input type="number" name="price">
		</td>
	</tr>
</table>
<input type="submit" value="Update Product">
</form>
</body>
</html>