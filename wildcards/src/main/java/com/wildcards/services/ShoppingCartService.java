package com.wildcards.services;

import java.util.List;

import com.wildcards.models.ShoppingCart;
import com.wildcards.models.ShoppingCartItems;

public interface ShoppingCartService {
	
	public List<ShoppingCartItems>getAllItems();
	
	public ShoppingCartItems createNewItem(ShoppingCartItems sci);
	
}
