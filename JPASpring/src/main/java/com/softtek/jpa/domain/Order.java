package com.softtek.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderKey id;

	@Embedded
	private OrderDetails orderDetails;

	public Order() {
		super();
	}
	
	public Order(Long orderId) {
		super();
		this.id = new OrderKey(orderId);
	}

	public Order(Long id, User user, int itemQuantity, float orderTotal, Status status, String shippingName,
			String shippingAddress, float shippingCost, Date orderDate, Date expectedDate) {
		super();
		this.id = new OrderKey(id);
		this.orderDetails = new OrderDetails(user, itemQuantity, orderTotal, status, shippingName, shippingAddress,
				shippingCost, orderDate, expectedDate);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderDetails == null) ? 0 : orderDetails.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderDetails == null) {
			if (other.orderDetails != null)
				return false;
		} else if (!orderDetails.equals(other.orderDetails))
			return false;
		return true;
	}

	public Long getId() {
		return id.getId();
	}

	public void setId(OrderKey id) {
		this.id = id;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDetails=" + orderDetails + "]";
	}
}