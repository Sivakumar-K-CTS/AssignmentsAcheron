package com.skgroceries.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("admin-page")
	public String adminMethod() {
		return "adminPage";
	}
	 
	@RequestMapping("add-product")
	public String addProduct() {
		return "addProduct";
	}
	
	@RequestMapping("delete-product")
	public String deleteProduct() {
		return "deleteProduct";
	}
	
	@RequestMapping("update-product")
	public String updateProduct() {
		return "updateProduct";
	}
	
	@RequestMapping("get-by-id")
	public String getProductById() {
		return "getProductById";
	}
	
	@RequestMapping("home-page")
	public String getBackToHome() {
		return "home";
	}
}
