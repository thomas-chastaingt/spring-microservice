package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.ProductDao;
import com.microservice.model.Product;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductDao productDao;
	
	public ProductService() {}

	
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}
	
	public Product getProduct(int id) {
		return productDao.findById(id);
	}
	
	public Product newProduct(Product product) {
		return productDao.save(product);
	}
}
