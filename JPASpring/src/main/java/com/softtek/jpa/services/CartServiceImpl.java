package com.softtek.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.domain.CartDetails;
import com.softtek.jpa.domain.CartKey;
import com.softtek.jpa.domain.Order;
import com.softtek.jpa.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;

	@Override
	public List<Cart> getCartList() {
		// TODO Auto-generated method stub
//		List<Cart> jpaList = cartRepository.findAll();
//		List<Cart> cartList;
//		for (Cart c : jpaList) {
//			CartKey key = new CartKey(c.getCartKey().getId());
//			Order order = new Order(c.getCartDetails().get, user, itemQuantity, orderTotal, status, shippingName, shippingAddress, shippingCost, orderDate, expectedDate)
//			CartDetails details = new CartDetails(orderId, productId, productQuantity)
//			cartList.add();
//		}
		return cartRepository.findAll();
	}
	
	@Override
	public Cart findCartById(Long cart_id) {
		// TODO Auto-generated method stub
		return cartRepository.findOne(new CartKey(cart_id));
	}

}