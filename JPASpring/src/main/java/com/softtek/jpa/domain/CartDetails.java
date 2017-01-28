package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@Embeddable
public class CartDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product productId;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order orderId;

	@Column(name = "quantity")
	private int productQuantity;

	public CartDetails() {
		super();
	}

	public CartDetails(Product productId, int productQuantity) {
		super();
		this.productId = productId;
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
		return Objects.hashCode(productId, productQuantity);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof CartDetails) {
			CartDetails that = (CartDetails) object;
			return Objects.equal(this.productId, that.productId)
					&& Objects.equal(this.productQuantity, that.productQuantity);
		}
		return false;
	}

}
