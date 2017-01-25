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

	public Order(OrderKey id, OrderDetails orderDetails) {
		super();
		this.id = id;
		this.orderDetails = orderDetails;
	}

}