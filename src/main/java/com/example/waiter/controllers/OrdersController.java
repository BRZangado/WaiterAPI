package com.example.waiter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.waiter.models.OrderList;
import com.example.waiter.repositories.OrderRepository;

@RestController
public class OrdersController {
	
	@Autowired
	OrderRepository or;
	
	@GetMapping("/orders")
	public List<OrderList> all(){
		return or.findAll();
	}
	
	@PostMapping("/orders")
	public OrderList new_order(@RequestBody OrderList new_order){
		return or.save(new_order);
	}
	
}
