package com.example.waiter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.waiter.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
