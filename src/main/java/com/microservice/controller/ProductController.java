package com.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Product;

@RestController
public class ProductController {
	
	@GetMapping(value="product/{id}")
	public Product getProduct(@PathVariable int id) {
		Product product = new Product(id, "produit1", 20);
		return product;
	}
}
