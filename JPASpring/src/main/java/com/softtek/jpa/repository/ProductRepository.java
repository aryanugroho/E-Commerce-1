package com.softtek.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query(value="SELECT DISTINCT p.category FROM Product p ORDER BY p.category ASC")
	List<String> getProductCategories();
}
