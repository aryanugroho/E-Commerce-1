package com.softtek.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.domain.CartKey;

@Repository
public interface CartRepository extends JpaRepository<Cart, CartKey> {
}