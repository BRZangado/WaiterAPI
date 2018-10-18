package com.example.waiter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.waiter.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
