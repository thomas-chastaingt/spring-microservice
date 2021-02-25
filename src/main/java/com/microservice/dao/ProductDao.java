package com.microservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	Product findById(int id);
}
