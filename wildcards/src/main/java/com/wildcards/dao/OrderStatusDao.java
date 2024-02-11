package com.wildcards.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcards.models.OrderStatus;

@Repository
public interface OrderStatusDao extends JpaRepository<OrderStatus, Integer> {

}
