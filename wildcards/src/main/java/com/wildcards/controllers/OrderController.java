package com.wildcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcards.models.Order;
import com.wildcards.services.OrderService;
import com.wildcards.services.OrderStatusService;

@RestController
@RequestMapping("order")
public class OrderController {

	private OrderService os;
	private OrderStatusService oss;

	@Autowired
	public OrderController(OrderService os, OrderStatusService oss) {
		this.os = os;
		this.oss = oss;
	}

	// Create New Order when user completes checkout
	@PostMapping
	public ResponseEntity<Order> createNewOrder(@RequestBody Order o) {
		if (o.getOrderId() != 0) {
			return new ResponseEntity("order Id must be 0", HttpStatus.BAD_REQUEST);
		}
		// sets the default order status to Completed
		o.setOrderStatus(oss.getOrderStatusByID(1));
		return new ResponseEntity(os.createNewOrder(o), HttpStatus.CREATED);

	}

	// Update order / change to cancelled
	@PatchMapping
	public ResponseEntity<Order> updateOrder(@RequestBody Order o) {// will try and turn the body into the object type on
		// its right
		if (o.getOrderId() == 0) {
			return new ResponseEntity("orderId must not be 0", HttpStatus.BAD_REQUEST);
		}
		o.setOrderStatus(oss.getOrderStatusByID(o.getOrderStatus().getStatusId()));
		return new ResponseEntity<Order>(os.updateOrder(o), HttpStatus.CREATED);
	}

	// Find Order by OrderID
	@GetMapping("{id}") // how to do pathvariables in spring
	public ResponseEntity<Order> getOrderById(@PathVariable int id) {
		if (id == 0) {
			return new ResponseEntity("Id must not be 0", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Order>(os.getOrderByID(id), HttpStatus.OK);
	}

	// Find Order by UserID
	@GetMapping("/user/{id}") // how to do pathvariables in spring
	public ResponseEntity<List<Order>> getOrdersByUserId(@PathVariable int id) {
		if (id == 0) {
			return new ResponseEntity("userId must not be 0", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(os.getOrdersByUserID(id), HttpStatus.OK);
	}

}
