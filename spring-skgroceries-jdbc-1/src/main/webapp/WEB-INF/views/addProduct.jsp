<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sk-Groceries-Add Product</title>
</head>
<body>

<h3>Enter the new Product Details</h3>

<form action="addProductToDb">
	<table>
		<tr>
			<td>
				Product Name:
			</td>
			<td>
				<input type="text" name="productName">
			</td>
		</tr>
		<tr>
			<td>
				Brand:
			</td>
			<td>
				<input type="text" name="brand">
			</td>
		</tr>
		<tr>
			<td>
				Category:
			</td>
			<td>
				<select name="category">
					<option value="GRAINS">Grains</option>
					<option value="MASALA">Masala</option>
					<option value="FRUITS">Fruits</option>
					<option value="VEGETABLES">Vegetables</option>
					<option value="OIL">Oil</option> 
				</select>
			</td>
		</tr>
		<tr>
			<td>
				Quantity in Kg's or Liter's:
			</td>
			<td>
				<input type="number" name="quantityInKgs">
			</td>
		</tr>
		<tr>
			<td>
				Price:
			</td>
			<td>
				<input type="number" name="price">
			</td>
		</tr>
		<tr>
			<td>
				Count of Product:
			</td>
			<td>
				<input type="number" name="count">
			</td>
		</tr>
	</table>
	<input type="submit" value="Add Product">
</form>
<br/>

</body>
</html>