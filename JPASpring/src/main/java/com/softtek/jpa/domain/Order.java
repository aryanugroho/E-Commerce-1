package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderKey id;

	@Embedded
	private OrderDetails orderDetails;

	public Order(Long id, Cart cart) {
		super();
		this.id = new OrderKey(id);
		this.orderDetails = new OrderDetails();
	}

	public Order() {
		super();
	}
}