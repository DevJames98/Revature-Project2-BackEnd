package com.wildcards.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Order
//Order_id (PK)
//User (linked to user table by user_id) 	(FK)
//totalPrice
//Order_status (linked to the status table by status_id) 	(FK)

@Entity
@Table(name = "order_table")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;

	// foreign key for user table, FK
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "users", referencedColumnName = "user_id")
	@JsonBackReference
	private Users users;

	@Column(name = "total_price")
	private int totalPrice;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "order_status", referencedColumnName = "status_id")
	private OrderStatus orderStatus;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, Users users, int totalPrice, OrderStatus orderStatus) {
		super();
		this.orderId = orderId;
		this.users = users;
		this.totalPrice = totalPrice;
		this.orderStatus = orderStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + totalPrice;
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Order other = (Order) obj;
		if (orderId != other.orderId)
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (totalPrice != other.totalPrice)
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", users=" + users + ", totalPrice=" + totalPrice + ", orderStatus="
				+ orderStatus + "]";
	}

}