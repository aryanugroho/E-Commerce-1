package com.softtek.jpa.services;

import java.util.List;

import com.softtek.jpa.domain.Order;

public interface OrderService {
	public List<Order> getOrderList();
	public Order getOrderById(Long order_id);
}
