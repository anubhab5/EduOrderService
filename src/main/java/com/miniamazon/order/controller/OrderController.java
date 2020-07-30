package com.miniamazon.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniamazon.order.model.Order;
import com.miniamazon.order.model.OrderDTO;
import com.miniamazon.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderSvc;

	@PostMapping(path = "/createorder")
	public Order createNewOrder(@RequestBody OrderDTO order) {
		return orderSvc.saveOrder(order);
	}

	@GetMapping("/getorderbyid/{id}")
	public Order getOrderById(@PathVariable Integer id) {
		return orderSvc.getOrderbyId(id);
	}
	
	@GetMapping("/allorder")
	public List<Order> getOrders(){
		return orderSvc.getAllOrders();
	}
}
