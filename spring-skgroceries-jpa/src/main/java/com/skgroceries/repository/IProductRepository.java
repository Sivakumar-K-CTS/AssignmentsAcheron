package com.skgroceries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skgroceries.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findProductByCategory(String category);
	List<Product> findByBrand(String brand);
	List<Product> findByProductNameContaining(String productName);
	List<Product> findByProductNameAndQuantityInKgs(String productName, int QuantityInKg);
	
}
