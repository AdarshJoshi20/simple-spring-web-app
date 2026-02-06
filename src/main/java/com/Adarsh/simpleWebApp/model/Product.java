package com.Adarsh.simpleWebApp.model;

import org.springframework.stereotype.Component;

//since this is a simple web project without database
//so the data (details) regarding different products is written 
//using this Product class
@Component
public class Product {
	
	private int prodId;
	private String prodName;
	private int price;
	
	public int getProdId() {
		return prodId;
	}
	
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	
	public Product(int prodId, String prodName, int price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	public Product() {
		super();
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}
	
	
}
