package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name = "carts")

@NamedNativeQueries({

		@NamedNativeQuery(
				name = "findCarts", 
				query = "SELECT c.cart_id as cartId, "
						+ "c.order_id as orderId, "
						+ "c.product_id as productId, "
						+ "c.quantity as quantity "
						+ "FROM carts c "
						+ "JOIN products p ON p.product_id = c.product_id", resultSetMapping = "CartsMapping"),

		@NamedNativeQuery(name = "findOneCart", query = "SELECT c.cart_id as cart_key, "
				+ "c.lines_amount as linesAmount, " + "c.shipping_amount as shippingAmount, "
				+ "c.cart_amount as cartAmount, " + "st.name as ship_to, " + "c.ship_to_id as shipToId, "
				+ "s.description as status, " + "c.status_id as statusId," + "c.create_date as createdate, "
				+ "c.update_date as updatedate "

				+ " FROM cart c " + " JOIN ship_to st ON st.ship_to_id = c.ship_to_id "
				+ " JOIN status s ON s.status_id = c.status_id "
				+ "WHERE c.cart_id = :cartId ", resultSetMapping = "CartsMapping") })

@SqlResultSetMappings({

		@SqlResultSetMapping(name = "CartsMapping", classes = {

				@ConstructorResult(targetClass = Cart.class, columns = {

						@ColumnResult(name = "cartId", type = Long.class),

						@ColumnResult(name = "orderId", type = Long.class),

						@ColumnResult(name = "productId", type = Long.class),

						@ColumnResult(name = "quantity", type = Integer.class) }) }) })

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

	public CartKey getId() {
		return id;
	}

	public void setId(CartKey id) {
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
