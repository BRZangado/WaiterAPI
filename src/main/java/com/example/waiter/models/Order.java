package com.example.waiter.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order implements Serializable{
	
	private static final long serialVersionUID = -4680500884760864937L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private List<Product> products;
	private int total_price;

}
