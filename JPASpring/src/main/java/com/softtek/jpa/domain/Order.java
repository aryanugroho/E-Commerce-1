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

	public Order(Long id, User user, int itemQuantity, float orderTotal, Status status, String shippingName,
			String shippingAddress, float shippingCost, Date orderDate, Date expectedDate) {
		super();
		this.id = new OrderKey(id);
		this.orderDetails = new OrderDetails(user, itemQuantity, orderTotal, status, shippingName, shippingAddress,
				shippingCost, orderDate, expectedDate);
	}
}