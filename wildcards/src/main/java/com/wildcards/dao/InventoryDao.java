package com.wildcards.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcards.models.Inventory;

@Repository
public interface InventoryDao extends JpaRepository<Inventory, Integer>{

	public List<Inventory> findByTypeTypeIdOrderByPriceAsc(int typeId); 
	
	public List<Inventory> findByTypeTypeIdOrderByPriceDesc(int typeId);
	
	public List<Inventory> findByBrandBrandIdOrderByPriceAsc(int brandId); 
	
	public List<Inventory> findByBrandBrandIdOrderByPriceDesc(int brandId);
}
