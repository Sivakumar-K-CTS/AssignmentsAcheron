package com.skgroceries.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skgroceries.model.Product;
import com.skgroceries.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;
	
	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product getById(int productId) {
		return productRepository.findById(productId).get();
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getByCategory(String category) {
		return productRepository.findProductByCategory(category);
	}

	@Override
	public List<Product> getByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}

	@Override
	public List<Product> getByProductNameContaining(String productName) {
		return productRepository.findByProductNameContaining(productName);
	}

	@Override
	public List<Product> getByProductNameAndQuantityInKg(String productName, int quantityInKg) {
		return productRepository.findByProductNameAndQuantityInKgs(productName, quantityInKg);
	}

}
