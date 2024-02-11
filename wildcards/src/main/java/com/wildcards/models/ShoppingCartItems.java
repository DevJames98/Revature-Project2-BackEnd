package com.wildcards.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.CascadeType;

@Entity
@Table(name = "shopping_cart_items")
//@IdClass(ShoppingCartItemsId.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ShoppingCartItems {
	
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ShoppingCartItemsId shoppingCartId;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JsonBackReference(value="cart")
	@JoinColumn(name = "ShoppingCart", referencedColumnName = "cart_id")
	public ShoppingCart shoppingCart;
	
	@ManyToOne
	@JsonBackReference(value="item")
	@JoinColumn(name = "item", referencedColumnName = "item_id")
	private Inventory item;
	
	@Column
	private int quantity;
	
	@Column
	private double price;

	public ShoppingCartItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartItems(ShoppingCartItemsId shoppingCartId, ShoppingCart shoppingCart, Inventory item,
			int quantity, double price) {
		super();
		this.shoppingCartId = shoppingCartId;
		this.shoppingCart = shoppingCart;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}

	public ShoppingCartItemsId getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(ShoppingCartItemsId shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Inventory getItem() {
		return item;
	}

	public void setItem(Inventory item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + ((shoppingCart == null) ? 0 : shoppingCart.hashCode());
		result = prime * result + ((shoppingCartId == null) ? 0 : shoppingCartId.hashCode());
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
		ShoppingCartItems other = (ShoppingCartItems) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (shoppingCart == null) {
			if (other.shoppingCart != null)
				return false;
		} else if (!shoppingCart.equals(other.shoppingCart))
			return false;
		if (shoppingCartId == null) {
			if (other.shoppingCartId != null)
				return false;
		} else if (!shoppingCartId.equals(other.shoppingCartId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShoppingCartItems [shoppingCartId=" + shoppingCartId + ", shoppingCart=" + shoppingCart + ", item="
				+ item + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
