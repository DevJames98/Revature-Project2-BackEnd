package com.wildcards.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcards.models.Inventory;
import com.wildcards.models.ShoppingCartItems;

public interface ShoppingCartItemsDao extends JpaRepository<ShoppingCartItems, Integer>{
	
	public List<Inventory> findByItemItemId(int itemId);
	
}