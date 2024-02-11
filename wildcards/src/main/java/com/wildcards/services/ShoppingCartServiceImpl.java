package com.wildcards.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.InventoryDao;
import com.wildcards.dao.ShoppingCartDao;
import com.wildcards.dao.ShoppingCartItemsDao;
import com.wildcards.models.Inventory;
import com.wildcards.models.ShoppingCart;
import com.wildcards.models.ShoppingCartItems;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	private ShoppingCartDao scd;
	private ShoppingCartItemsDao id;
	//test
	private InventoryDao invd;

	@Autowired
	public ShoppingCartServiceImpl(ShoppingCartDao scd, ShoppingCartItemsDao id, InventoryDao invd) {
		this.scd = scd;
		this.id = id;
		this.invd = invd;
	}

	@Override
	public List<ShoppingCartItems> getAllItems() {
		return id.findAll();
	}
	
	@Override
	public ShoppingCartItems createNewItem(ShoppingCartItems sci) {
		//test
		System.out.println("Search item" + sci.getItem().getItemId());
		//finds the specified item using dao function
//		List<Inventory> i = id.findByItemItemId(sci.getItem().getItemId());
		Optional<Inventory> i = invd.findById(sci.getItem().getItemId());

		//test
		System.out.println("List " + i);
		//set the item for the object based on whatever item id they passed in
		sci.setItem(i.get());
//		sets the price by multiplying item price with quantity of items specified
		sci.setPrice((sci.getItem().getPrice()) * sci.getQuantity() );
		//test
		System.out.println("Before save" + sci);
		//test
		ShoppingCartItems test = id.save(sci);
		System.out.println(test.toString());
		return test;
	}
	
}
