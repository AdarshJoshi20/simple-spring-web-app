package com.Adarsh.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//RestController will respond with data to client, while Controller will respond to client with html page
@RestController // marks this class as a REST controller
public class HomeController {
	// "/" is for home page
	@RequestMapping("/") // this basically means that if '/' request is sent to server then this greet method should be called
	public String greet() {
		// this string goes directly to client
		//as HTTP response body
		return "Welcome to web app";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "This is about page of my web app!";
	}
}
