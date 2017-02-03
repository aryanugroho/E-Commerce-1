package com.softtek.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.jpa.domain.Product;
import com.softtek.jpa.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getProductList() {
		List<Product> productList;
		productList = productRepository.findAll();
		return productList;
	}

	@Override
	public Product getProductById(Long productId) {
		Product product;
		product = productRepository.findOne(productId);
		return product;
	}

	@Override
	public List<String> getProductCategories() {
		List<String> productCategories;
		productCategories = productRepository.getProductCategories();
		System.out.println(productCategories);
		return productCategories;
	}

}
