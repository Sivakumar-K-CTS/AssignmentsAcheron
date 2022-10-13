package com.skgroceries.service;

import java.util.List;

import com.skgroceries.model.Product;

public interface IProductService {
	void addProduct(Product product);

	void deleteProduct(int productId);

	void updateProduct(Product product);

	Product getById(int id);
	
	
	List<Product> getAllProducts();

	List<Product> getByCategory(String category);
	
	List<Product> getByBrand(String brand);

	List<Product> getByProductNameContaining(String productName);

	List<Product> getByProductNameAndQuantityInKg(String productName, int QuantityInKg);


	
}
