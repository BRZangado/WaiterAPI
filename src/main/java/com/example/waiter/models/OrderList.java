package com.example.waiter.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class OrderList implements Serializable{
	
	private static final long serialVersionUID = -4680500884760864937L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int total_price;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "order_products")
	private List<Product> products = new ArrayList<>();
	
	public OrderList(int total_price, List<Product> products) {
		super();
		this.total_price = total_price;
		this.products = products;
	}
	
	public OrderList() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
