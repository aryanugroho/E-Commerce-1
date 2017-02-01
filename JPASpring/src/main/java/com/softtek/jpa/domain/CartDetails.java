package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Embeddable
public class CartDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order orderId;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product productId;

	@Column(name = "quantity")
	private int productQuantity;

	public CartDetails() {
		super();
	}

	public CartDetails(Long orderId, Long productId, int productQuantity) {
		super();
		this.orderId = new Order(orderId);
		this.productId = new Product(productId);
		this.productQuantity = productQuantity;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + productQuantity;
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
		CartDetails other = (CartDetails) obj;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productQuantity != other.productQuantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CartDetails [orderId=" + orderId + ", productId=" + productId + ", productQuantity=" + productQuantity
				+ "]";
	}

}
