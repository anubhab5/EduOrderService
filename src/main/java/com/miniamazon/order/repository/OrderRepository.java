package com.miniamazon.order.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniamazon.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	Optional<Order> findByOrderDescription(String name);

}
