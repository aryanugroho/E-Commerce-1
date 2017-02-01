package com.softtek.jpa.services;

import java.util.List;

import com.softtek.jpa.domain.Cart;

public interface CartService {
	public Cart findCartById(Long cart_id);
	public List<Cart> getCartList();
}
