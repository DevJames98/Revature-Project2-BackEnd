package com.wildcards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.wildcards.dao.OrderDao;
import com.wildcards.models.Order;

@Service
public class OrderServiceImpl implements OrderService {

	private OrderDao od;

	@Autowired
	public OrderServiceImpl(OrderDao od) {
		this.od = od;
	}

	@Override
	public Order createNewOrder(Order o) {
		// TODO Auto-generated method stub
		// adds order to user's order list
		o.getUsers().getUserOrders().add(o);
		return od.save(o);
	}

	@Override
	@Transactional
	public Order updateOrder(Order o) {
		Order previousOrder = od.getOne(o.getOrderId());
		if (o.getUsers() != null) {
			previousOrder.setUsers(o.getUsers());
		}
		if (o.getTotalPrice() != 0) {
			previousOrder.setTotalPrice(o.getTotalPrice());
		}
		if (o.getOrderStatus() != null) {
			previousOrder.setOrderStatus(o.getOrderStatus());
			// previousOrder.setOrderStatus(oss.getOrderStatusByID(1));
		}
		return previousOrder;
	}

	@Override
	public Order getOrderByID(int id) {
		// TODO Auto-generated method stub
		return od.getOne(id);
	}

	@Override
	public List<Order> getOrdersByUserID(int id) {
		// TODO Auto-generated method stub
		return od.findByUsersUserId(id);
	}

}
