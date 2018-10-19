package com.example.waiter.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class OrderList implements Serializable{
	
	private static final long serialVersionUID = -4680500884760864937L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int total_price;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "order_products")
	private List<Product> products = new ArrayList<>();
	
	public OrderList(List<Product> products) {
		this.total_price = 0;
		this.products = products;
		for(Product product : products) {
			this.total_price += product.getPrice_cents();
		}
		
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
	public List<Long> getProducts() {
		List<Long> products_ids = new ArrayList<>();
		for(Product product : this.products) {
			products_ids.add(product.getId());
		}
		return products_ids;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
