package com.softtek.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.Order;
import com.softtek.jpa.domain.OrderKey;

@Repository
public interface OrderRepository extends JpaRepository<Order, OrderKey> {

}
