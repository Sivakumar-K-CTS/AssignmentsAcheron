package com.skgroceries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skgroceries.model.Product;
import com.skgroceries.service.IProductService;

@SpringBootApplication
public class SpringSkgroceriesJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringSkgroceriesJpaApplication.class, args);
	}
	
	@Autowired
	IProductService service;

	@Override
	public void run(String... args) throws Exception {
		/*Product product = new Product(101, "Aachi Mutton Masala", "Aachi", "Masala", 1, 220.00, 20);
		service.addProduct(product);*/
		
		//Product product = new Product(101, "Raja Ponni Rice", "Raja", "Grains", 20, 2220.00, 6);
		//service.updateProduct(product);
		
		//service.deleteProduct(101);
		
		/*product = new Product(102, "Raja IR20 Rice", "Raja", "Grains", 20, 2220.00, 6);
		service.updateProduct(product);
		
		product = new Product(103, "Aachi Chicken Masala", "Aachi", "Masala", 1, 210.00, 10);
		service.updateProduct(product);
		
		product = new Product(104, "Aachi Mutton Masala", "Aachi", "Masala", 1, 250.00, 15);
		service.updateProduct(product);
		
		product = new Product(105, "Royal Apple", "Royal", "Fruits", 5, 400.00, 10);
		service.updateProduct(product);*/
		
		System.out.println("**********");
		System.out.println(service.getById(103));
		System.out.println("**********");
		service.getByCategory("Masala").forEach(System.out::println);
		System.out.println("**********");
		service.getByProductNameContaining("Aa").forEach(System.out::println);
		System.out.println("**********");
		service.getByProductNameAndQuantityInKg("Aachi Chicken Masala", 5).forEach(System.out::println);
		System.out.println("**********");
		service.getByBrand("Aachi").forEach(System.out::println);
		System.out.println("**********");
		service.getAllProducts().forEach(System.out::println);
		System.out.println("**********");
		
		
		
		
		
	}

}
