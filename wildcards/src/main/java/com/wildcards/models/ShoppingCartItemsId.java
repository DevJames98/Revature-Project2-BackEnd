package com.wildcards.models;

import java.io.Serializable;

import javax.persistence.Embeddable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ShoppingCartItemsId implements Serializable{
	
	private int cartId;
	private int itemId;
	
	public ShoppingCartItemsId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartItemsId(int cartId, int itemId) {
		super();
		this.cartId = cartId;
		this.itemId = itemId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartId;
		result = prime * result + itemId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoppingCartItemsId other = (ShoppingCartItemsId) obj;
		if (cartId != other.cartId)
			return false;
		if (itemId != other.itemId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShoppingCartItemsId [cartId=" + cartId + ", itemId=" + itemId + "]";
	}
	
	
	
}
