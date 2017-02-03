package com.softtek.jpa.services;

import java.util.List;

import com.softtek.jpa.domain.Product;

public interface ProductService {
	public List<Product> getProductList();
	public Product getProductById(Long productId);
	public List<String> getProductCategories();
}
