package com.wildcards.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wildcards.models.Inventory;
import com.wildcards.services.InventoryService;

@RestController
@RequestMapping("Inventory")
public class InventoryController {

	private InventoryService is;

	@Autowired
	public InventoryController(InventoryService is) {
		this.is = is;
	}

	// Get All Inventory
	@GetMapping
	public ResponseEntity<List<Inventory>> getAllInventory() {

		return new ResponseEntity(is.getAllInventory(), HttpStatus.OK);
	}

	// Create New Inventory
	@PostMapping
	public ResponseEntity<Inventory> createNewItem(@RequestBody Inventory i) {
		if (i.getItemId() != 0) {
			return new ResponseEntity("Id must be 0", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(is.createNewItem(i), HttpStatus.CREATED);
	}

	// Search for item by type
	@GetMapping("{typeId}")
	public ResponseEntity<List<Inventory>> getByTypeId(@PathVariable int typeId) {
		// HttpServletRequest req = ((ServletRequestAttributes)
		// RequestContextHolder.getRequestAttributes()).getRequest();
		List<Inventory> i = is.getByTypeId(typeId);
		// add an object to the session
		// req.getSession().setAttribute("inventory", i);
		if (typeId == 0) {
			return new ResponseEntity("TypeId must not be 0", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(is.getByTypeId(typeId), HttpStatus.OK);
	}

	
	@GetMapping("{brandId}")
	public ResponseEntity<List<Inventory>> getByBrandId(@PathVariable int brandId) {
		// HttpServletRequest req = ((ServletRequestAttributes)
		// RequestContextHolder.getRequestAttributes()).getRequest();
		List<Inventory> i = is.getByBrandId(brandId);
		// add an object to the session
		// req.getSession().setAttribute("inventory", i);
		if (brandId == 0) {
			return new ResponseEntity("TypeBrand must not be 0", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(is.getByBrandId(brandId), HttpStatus.OK);
	}
	
	
}
