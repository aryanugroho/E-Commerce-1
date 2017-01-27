package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@Embeddable
public class CartDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "product_id")
	private int productId;

	@Column(name = "quantity")
	private int productQuantity;

	public CartDetails() {
		super();
	}

	public CartDetails(int productId, int productQuantity) {
		super();
		this.productId = productId;
		this.productQuantity = productQuantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
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

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("productId", productId).add("productQuantity", productQuantity)
				.toString();
	}

}
