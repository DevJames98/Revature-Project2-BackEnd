package com.wildcards.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcards.models.ShoppingCart;

public interface ShoppingCartDao extends JpaRepository<ShoppingCart, Integer>{

}
