package com.softtek.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.domain.CartKey;
import com.softtek.jpa.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;

	@Override
	public List<Cart> getCartList() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}
	
	@Override
	public Cart findCartById(Long cart_id) {
		// TODO Auto-generated method stub
		return cartRepository.findOne(new CartKey(cart_id));
	}

}