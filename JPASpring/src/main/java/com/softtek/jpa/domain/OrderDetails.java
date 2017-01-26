package com.softtek.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name="quantity", nullable=false)
	private float itemQuantity;

	@Column(name = "status_id", nullable = false)
	private int statusId;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "expected_date")
	private Date expectedDate;
}
