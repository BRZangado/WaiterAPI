package com.example.waiter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.waiter.models.OrderList;

public interface OrderRepository extends JpaRepository<OrderList, Long>{

}
