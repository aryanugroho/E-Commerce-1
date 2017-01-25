package com.softtek.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartRepository;
	
	@Override
	public List<Cart> cartList() {
		// TODO Auto-generated method stub
		return cartRepository.cartList();
	}

	@Override
	public Cart cart(Long cart_id) {
		// TODO Auto-generated method stub
		return cartRepository.cart(cart_id);
	}

}
