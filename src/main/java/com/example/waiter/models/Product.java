package com.example.waiter.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product implements Serializable{
	
	private static final long serialVersionUID = -1098552145388747248L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private int price_cents;
	private String description;
	@ManyToMany(mappedBy = "products")
	@JsonIgnore
	private List<OrderList> orders = new ArrayList<>();
	
	public Product(String name, int price_cents, String description) {
		this.name = name;
		this.price_cents = price_cents;
		this.description = description;
	}
	
	public Product() {}
	
	public List<OrderList> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderList> orders) {
		this.orders = orders;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice_cents() {
		return price_cents;
	}
	public void setPrice_cents(int price_cents) {
		this.price_cents = price_cents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
