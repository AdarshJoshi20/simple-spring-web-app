package com.Adarsh.simpleWebApp.service;
import com.Adarsh.simpleWebApp.controller.ProductController;
import com.Adarsh.simpleWebApp.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;



@Service
public class ProductService {

    private final Product product;
	
	List<Product> products = new ArrayList<>(Arrays.asList(
			new Product(101, "iphone", 60000),
			new Product(100, "laptop", 100000),
			new Product(102, "cannon", 12321)));

    ProductService(Product product) {
        this.product = product;
    }

	public List<Product> getProducts(){
		return products;
	}

	

//	public Product getProductById(int prodId) {
//		return products.stream() // converts the list (of products) into a Stream.
//				.filter(p -> p.getProdId() == prodId) // goes through each product (p) one by one and keeps only that product whose prodId matches given Id.
//				.findFirst().get();// from the filtered results, pick the first matching product
//	
//	}
	
	//Equivalent code without using Stream 
	public Product getProductById(int prodId) {
	    for (Product product : products) {
	        if (product.getProdId() == prodId) {
	            return product; // product found
	        }
	    }
	    return null; // product not found
	}
	
	
	// Adding a new product is done by the client on the server.
	// ie the client tells the controller that it wants to add this particular product.
	public void addProduct(Product prod)
	{
		
		products.add(new Product(105, "blanket", 800));
	}



	public void updateProduct(Product prod) {
		// TODO Auto-generated method stub
		
		int index = 0;
		
		for(int i = 0; i<products.size(); i++)
		{
			if(products.get(i).getProdId() == prod.getProdId())
				index = i;
		}
		products.set(index, prod);
		
	}

	public void deleteProduct(int prodId) {
		// TODO Auto-generated method stub
		
		int index = 0;
		
		// PROBLEM of below code: if entered id is not found, it will delete the 
		// first item in the product list, which should not happen ideally.
		for(int i = 0; i<products.size(); i++)
		{
			// if product id of any ith product (from products list)
			//matches the id entered (in the url search query) then remove it
			
			if(products.get(i).getProdId() == prodId)
			{
				index = i;
			}
		}
		
		products.remove(index);
		
	}

}
