<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sk-Groceries-Get-Product-By-ID</title>
</head>
<body>
<h3>Enter the Product Id to Search</h3>
<form action="getProduct-byID">
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
<input type="submit" value="Get Product">
</form>
${product}
<a href="get-home"></a>
</body>
</html>