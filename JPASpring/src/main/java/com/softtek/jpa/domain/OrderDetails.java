package com.softtek.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expectedDate == null) ? 0 : expectedDate.hashCode());
		result = prime * result + itemQuantity;
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + Float.floatToIntBits(orderTotal);
		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
		result = prime * result + Float.floatToIntBits(shippingCost);
		result = prime * result + ((shippingName == null) ? 0 : shippingName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		OrderDetails other = (OrderDetails) obj;
		if (expectedDate == null) {
			if (other.expectedDate != null)
				return false;
		} else if (!expectedDate.equals(other.expectedDate))
			return false;
		if (itemQuantity != other.itemQuantity)
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (Float.floatToIntBits(orderTotal) != Float.floatToIntBits(other.orderTotal))
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		if (Float.floatToIntBits(shippingCost) != Float.floatToIntBits(other.shippingCost))
			return false;
		if (shippingName == null) {
			if (other.shippingName != null)
				return false;
		} else if (!shippingName.equals(other.shippingName))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderDetails [user=" + user + ", itemQuantity=" + itemQuantity + ", orderTotal=" + orderTotal
				+ ", status=" + status + ", shippingName=" + shippingName + ", shippingAddress=" + shippingAddress
				+ ", shippingCost=" + shippingCost + ", orderDate=" + orderDate + ", expectedDate=" + expectedDate
				+ "]";
	}


}
