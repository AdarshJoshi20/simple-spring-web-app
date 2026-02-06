package com.Adarsh.simpleWebApp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Adarsh.simpleWebApp.model.Product;
import com.Adarsh.simpleWebApp.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return service.getProducts();	
	}
	// Get operation is for reading
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId)
	{
		return service.getProductById(prodId);
	}
	
	//Post operation is for creating
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		service.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod)
	{
		service.updateProduct(prod);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId)
	{
		service.deleteProduct(prodId);
		System.out.println(prodId + "product deleted successfully");
	}
}
