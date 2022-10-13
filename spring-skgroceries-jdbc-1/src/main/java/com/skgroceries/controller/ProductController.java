package com.skgroceries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skgroceries.exceptions.ProductNotFoundException;
import com.skgroceries.model.Product;
import com.skgroceries.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService service;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("addProductToDb")
	public String addProductToDb(Product product, Model model) {
		boolean result =service.addProduct(product);
		if(result) {
			model.addAttribute("result", "Product has been successfully added!!!");
		}
		return "adminPage";
	}
	
	@RequestMapping("deleteProductRecord")
	public String deleteProductRecord(int productId, Model model) {
		boolean result =service.deleteProduct(productId);
		if(result) {
			model.addAttribute("result", "Product has been successfully Removed!!!");
		}else {
			model.addAttribute("result", "Product ID not found***");
		}
		return "adminPage";
	}
	
	@RequestMapping("updateProductRecord")
	public String updateProductRecord(int productId, double price, Model model) {
		boolean result =service.updateProduct(productId,price);
		if(result) {
			model.addAttribute("result", "Product price has been successfully Updated!!!");
		}else {
			model.addAttribute("result", "Product ID not found***");
		}
		return "adminPage";
	}
	
	@RequestMapping("getProduct-byID")
	public String getProductById(int productId, Model model) {
		Product product;
		try {
			product = service.getById(productId);
			model.addAttribute("product", product);
		} catch (ProductNotFoundException e) {
			model.addAttribute("product", e.getMessage());
		}
		return "getProductById";
	}
}
