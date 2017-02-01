package com.softtek.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.Order;
import com.softtek.jpa.domain.OrderKey;
import com.softtek.jpa.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> getOrderList() {
		List<Order> orderList;
		orderList = orderRepository.findAll();
		return orderList;
	}

	@Override
	public Order getOrderById(Long order_id) {
		Order foundOrder;
		foundOrder = orderRepository.findOne(new OrderKey(order_id));
		return foundOrder;
	}

}
