package com.wildcards.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.InventoryDao;
import com.wildcards.models.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {

	private InventoryDao id;

	@Autowired
	public InventoryServiceImpl(InventoryDao id) {
		this.id = id;
	}

	@Override
	public List<Inventory> getAllInventory() {
		return id.findAll();
	}

	@Override
	public Inventory createNewItem(Inventory i) {
		// TODO Auto-generated method stub
		return id.save(i);
	}

	@Override
	public List<Inventory> getByTypeId(int typeId) {
		boolean asc = true;
				if (asc == true) {
					return id.findByTypeTypeIdOrderByPriceAsc(typeId);
				}
				else {
					return id.findByTypeTypeIdOrderByPriceDesc(typeId);
				}
	}
	
	@Override
	public List<Inventory> getByBrandId(int brandId) {
		boolean asc = true;
				if (asc == true) {
					return id.findByBrandBrandIdOrderByPriceAsc(brandId);
				}
				else {
					return id.findByBrandBrandIdOrderByPriceDesc(brandId);
				}
	}
}
