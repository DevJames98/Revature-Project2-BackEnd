package com.wildcards.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderItemsId implements Serializable {

  // make this a foreign key to order table
  @Column(name = "order_id")
  private int orderId;

  // make this a foreign key to inventory table
  @Column(name = "item_id")
  private int itemId;

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
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
    result = prime * result + itemId;
    result = prime * result + orderId;
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
    OrderItemsId other = (OrderItemsId) obj;
    if (itemId != other.itemId)
      return false;
    if (orderId != other.orderId)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "OrderItemsId [itemId=" + itemId + ", orderId=" + orderId + "]";
  }

  public OrderItemsId() {
    super();
  }
}