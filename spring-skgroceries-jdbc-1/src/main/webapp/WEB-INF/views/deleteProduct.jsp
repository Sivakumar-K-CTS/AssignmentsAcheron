<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sk-Groceries-Delete-Product</title>
</head>
<body>
<h3>Enter the Product Id to be Deleted</h3>
<form action="deleteProductRecord">
<table>
	<tr>
		<td>
			Product ID:
		</td>
		<td>
			<input type="text" name="productId">
		</td>
	</tr>
</table>
<input type="submit" value="Delete Product">
</form>
</body>
</html>