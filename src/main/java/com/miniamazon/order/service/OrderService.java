package com.miniamazon.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniamazon.order.model.Order;
import com.miniamazon.order.model.OrderDTO;
import com.miniamazon.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepo;

	public Order saveOrder(OrderDTO order) {
		Order newOrder = new Order();
		newOrder.setOrderDescription(order.getOrderDescription());
		newOrder.setOrderCreatedDate(new Date());
		Order savedOrder = orderRepo.save(newOrder);
		return savedOrder;
	}

	public Order getOrderbyId(Integer id) {
		Optional<Order> o = orderRepo.findById(id);
		if (o.isPresent()) {
			return o.get();
		}
		return null;
	}

	public List<Order> getAllOrders() {
		return orderRepo.findAll();
	}

	public Order getOrderByName(String name) {
		System.out.println(name);
		Optional<Order> o = orderRepo.findByOrderDescription(name);
		if (o.isPresent()) {
			return o.get();
		}
		return null;

	}

}
