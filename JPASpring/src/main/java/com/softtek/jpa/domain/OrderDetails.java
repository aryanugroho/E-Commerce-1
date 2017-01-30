package com.softtek.jpa.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.google.common.base.Objects;

@Embeddable
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "username", nullable = false)
	private Users user;

	@Column(name = "quantity", nullable = false)
	private int itemQuantity;

	@Column(name = "total", nullable = false)
	private float orderTotal;

	@ManyToOne
	@JoinColumn(name = "status_id", nullable = false)
	private Status status;

	@Column(name = "shipping_name", nullable = false)
	private String shippingName;

	@Column(name = "shipping_address", nullable = false)
	private String shippingAddress;

	@Column(name = "shipping_cost", nullable = false)
	private float shippingCost;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "expected_date")
	private Date expectedDate;

	public OrderDetails() {
		super();
	}

	public OrderDetails(Users user, int itemQuantity, float orderTotal, Status status, String shippingName,
			String shippingAddress, float shippingCost, Date orderDate, Date expectedDate) {
		super();
		this.user = user;
		this.itemQuantity = itemQuantity;
		this.orderTotal = orderTotal;
		this.status = status;
		this.shippingName = shippingName;
		this.shippingAddress = shippingAddress;
		this.shippingCost = shippingCost;
		this.orderDate = orderDate;
		this.expectedDate = expectedDate;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(user, itemQuantity, orderTotal, status, shippingName, shippingAddress, shippingCost,
				orderDate, expectedDate);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof OrderDetails) {
			OrderDetails that = (OrderDetails) object;
			return Objects.equal(this.user, that.user) && Objects.equal(this.itemQuantity, that.itemQuantity)
					&& Objects.equal(this.orderTotal, that.orderTotal) && Objects.equal(this.status, that.status)
					&& Objects.equal(this.shippingName, that.shippingName)
					&& Objects.equal(this.shippingAddress, that.shippingAddress)
					&& Objects.equal(this.shippingCost, that.shippingCost)
					&& Objects.equal(this.orderDate, that.orderDate)
					&& Objects.equal(this.expectedDate, that.expectedDate);
		}
		return false;
	}

}
