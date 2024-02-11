package com.wildcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcards.models.Inventory;
import com.wildcards.models.ShoppingCart;
import com.wildcards.models.ShoppingCartItems;
//import com.wildcards.services.OrderService;
import com.wildcards.services.ShoppingCartService;

@RestController
@RequestMapping("shopping_cart")
public class ShoppingCartController {
	
	private ShoppingCartService sc;
	
	@Autowired
	public ShoppingCartController(ShoppingCartService sc) {
		this.sc = sc;
	}
		
	@GetMapping
	public ResponseEntity<List<ShoppingCartItems>> getAllCartItems(){
		return new ResponseEntity(sc.getAllItems(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<ShoppingCartItems> createNewItem(@RequestBody ShoppingCartItems sci) {
//		if (sci.getItem().getItemId() != 0) {
//			return new ResponseEntity("Id must be 0", HttpStatus.BAD_REQUEST);
//		}
		if (sci.getItem().getItemId() == 0) {
			return new ResponseEntity("Id must not be 0", HttpStatus.BAD_REQUEST);
		}
		//test
		System.out.println("Controller" + sci.toString());
		return new ResponseEntity(sc.createNewItem(sci), HttpStatus.CREATED);
	}
	
}
