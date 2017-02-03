package com.softtek.jpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.jpa.domain.Product;
import com.softtek.jpa.services.ProductService;

@RequestMapping(value = "/")
@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/getproductlist", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getProductList() {
		List<Product> productList = productService.getProductList();
		if (productList.isEmpty()) {
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}

	@RequestMapping(value = "/getproductcategories", method = RequestMethod.GET)
	public ResponseEntity<List<String>> getProductCategories() {
		List<String> productCategories = productService.getProductCategories();
		if (productCategories.isEmpty()) {
			return new ResponseEntity<List<String>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<String>>(productCategories, HttpStatus.OK);
	}
}
