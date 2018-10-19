package com.example.waiter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.waiter.models.Product;
import com.example.waiter.repositories.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository pr;
	
	@GetMapping("/products")
	public List<Product> all(){
		return pr.findAll();
	}
	
	@PostMapping("/products")
	public Product new_product(@RequestBody Product new_product){
		return pr.save(new_product);
	}

}
