package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "carts")
public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CartKey id;

	@Embedded
	private CartDetails cartDetails;

	public Cart() {
		super();
	}

	public Cart(CartKey id, CartDetails cartDetails) {
		super();
		this.id = id;
		this.cartDetails = cartDetails;
	}
	
	public Cart(Long cartId, Long orderId, Long productId, int quantity){
		this.id = new CartKey(cartId);
		this.cartDetails = new CartDetails(orderId, productId, quantity);
	}

	public CartKey getCartKey() {
		return id;
	}

	public void setCartKey(CartKey id) {
		this.id = id;
	}

	public CartDetails getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(CartDetails cartDetails) {
		this.cartDetails = cartDetails;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartDetails == null) ? 0 : cartDetails.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Cart other = (Cart) obj;
		if (cartDetails == null) {
			if (other.cartDetails != null)
				return false;
		} else if (!cartDetails.equals(other.cartDetails))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id.getId() + ", " + cartDetails + "]";
	}

}
