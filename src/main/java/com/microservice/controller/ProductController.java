package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.dao.ProductDao;
import com.microservice.model.Product;
import com.microservice.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private ProductService productService;

	@GetMapping(value = "products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping(value = "products/{id}")
	public Product getProducts(@PathVariable int id) {
		return productService.getProduct(id);
	}

	@PostMapping(value = "products")
	public Product newProducts(@RequestBody Product product) {
		Product productReceiver = productService.newProduct(product);
		return productReceiver;
	}

}
