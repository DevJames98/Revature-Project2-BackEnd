package com.wildcards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.OrderStatusDao;
import com.wildcards.models.OrderStatus;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

  private OrderStatusDao osd;

  @Autowired
  public OrderStatusServiceImpl(OrderStatusDao osd) {
    this.osd = osd;
  }

  @Override
  public OrderStatus getOrderStatusByID(int id) {
    // TODO Auto-generated method stub
    return osd.getOne(id);
  }

}
