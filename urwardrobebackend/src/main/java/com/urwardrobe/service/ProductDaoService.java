package com.urwardrobe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.urwardrobe.model.Product;
@Service
public interface ProductDaoService {
	
public void save(Product prdt);
public void update(Product prdt);
public void delete(int product_Id);
public List<Product> listProduct();
public Product getProduct(int product_Id);

	
	
	
}
