package com.wildcards.services;

import com.wildcards.models.Order;
import java.util.List;

public interface OrderService {

  public Order createNewOrder(Order o);

  public Order updateOrder(Order o);

  public Order getOrderByID(int id);

  public List<Order> getOrdersByUserID(int id);

}
