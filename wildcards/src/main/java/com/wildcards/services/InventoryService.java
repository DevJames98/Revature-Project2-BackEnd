package com.wildcards.services;

import java.util.List;

import com.wildcards.models.Inventory;

public interface InventoryService {
	
	public List <Inventory> getAllInventory();
	
	public Inventory createNewItem(Inventory i);
	
	public List<Inventory> getByTypeId(int typeId);
	
	public List<Inventory> getByBrandId(int brandId);

}
