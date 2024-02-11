package com.wildcards.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.wildcards.models.Order;;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

  public List<Order> findByUsersUserId(int userId);

}
