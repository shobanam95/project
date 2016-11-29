package com.urwardrobe.dao;



import java.util.List;

import com.urwardrobe.model.Product;
import com.urwardrobe.service.ProductDaoService;

public interface DaoService { // when interface is used implementation will execute only the methods in daoservice 
	public void save(Product prdt);
	public void update(Product prdt);
	public void delete(int product_Id);
	 public List<Product> listProduct();
	public Product getProduct(int product_Id);
	public  List<Product> getProduct(String category);
}


