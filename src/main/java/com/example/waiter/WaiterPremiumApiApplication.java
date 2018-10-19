package com.example.waiter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.waiter.models.OrderList;
import com.example.waiter.models.Product;
import com.example.waiter.repositories.OrderRepository;
import com.example.waiter.repositories.ProductRepository;

@SpringBootApplication
public class WaiterPremiumApiApplication {
	
	@Autowired
	OrderRepository or;
	@Autowired
	ProductRepository pr;

	public static void main(String[] args) {
		SpringApplication.run(WaiterPremiumApiApplication.class, args);
	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	
	    	Product p1 = new Product("Item1", 199, "teste de produto");
	    	Product p2 = new Product("Item2", 199, "teste de produto");
	    	Product p3 = new Product("Item3", 199, "teste de produto");
	    	
	    	pr.save(p1);
	    	pr.save(p2);
	    	pr.save(p3);
	    	
	    	List<Product> products = new ArrayList<>();
	    	products.add(p1);
	    	products.add(p2);
	    	products.add(p3);
	    	
	    	OrderList order = new OrderList(products);
	    	
	    	or.save(order);
	        
	      };
	}
}
