package com.miniamazon.order.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniamazon.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	Optional<Order> findByName(String name);

}
