package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@Entity
@Table(name = "carts")
/*
 * @NamedNativeQueries({
 * 
 * @NamedNativeQuery( name="findCarts", query="SELECT c.cart_id as cart_key, " +
 * "c.lines_amount as linesAmount, " + "c.shipping_amount as shippingAmount, " +
 * "c.cart_amount as cartAmount, " + "st.name as ship_to, " +
 * "c.ship_to_id as shipToId, " + "s.description as status, " +
 * "c.status_id as statusId, " + "c.create_date as createdate, " +
 * "c.update_date as updatedate " +" FROM cart c " +
 * " JOIN ship_to st ON st.ship_to_id = c.ship_to_id " +
 * " JOIN status s ON s.status_id = c.status_id ", resultSetMapping =
 * "CartsMapping"),
 * 
 * @NamedNativeQuery( name="findOneCart", query="SELECT c.cart_id as cart_key, "
 * + "c.lines_amount as linesAmount, " + "c.shipping_amount as shippingAmount, "
 * + "c.cart_amount as cartAmount, " + "st.name as ship_to, " +
 * "c.ship_to_id as shipToId, " + "s.description as status, " +
 * "c.status_id as statusId," + "c.create_date as createdate, " +
 * "c.update_date as updatedate "
 * 
 * +" FROM cart c " + " JOIN ship_to st ON st.ship_to_id = c.ship_to_id " +
 * " JOIN status s ON s.status_id = c.status_id " +
 * "WHERE c.cart_id = :cartId ", resultSetMapping = "CartsMapping") })
 * 
 * @SqlResultSetMappings({
 * 
 * @SqlResultSetMapping(name="CartsMapping", classes= {
 * 
 * @ConstructorResult( targetClass = Cart.class, columns = {
 * 
 * @ColumnResult(name = "cart_key", type = Long.class),
 * 
 * @ColumnResult(name = "linesAmount", type = Double.class),
 * 
 * @ColumnResult(name = "shippingAmount", type = Double.class),
 * 
 * @ColumnResult(name = "cartAmount", type = Double.class),
 * 
 * @ColumnResult(name = "ship_to", type= String.class),
 * 
 * @ColumnResult(name = "shipToId", type= Long.class),
 * 
 * @ColumnResult(name = "status", type = String.class),
 * 
 * @ColumnResult(name = "statusId", type= Long.class),
 * 
 * @ColumnResult(name = "createdate", type= Date.class),
 * 
 * @ColumnResult(name = "updatedate", type= Date.class) }) }) })
 */

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
		return Objects.hashCode(id, cartDetails);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Cart) {
			Cart that = (Cart) object;
			return Objects.equal(this.id, that.id) && Objects.equal(this.cartDetails, that.cartDetails);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartDetails=" + cartDetails + "]";
	}

}
