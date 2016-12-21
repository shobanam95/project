package com.urwardrobe.dao;



import java.util.List;

import com.urwardrobe.model.Product;


public interface DaoService { // when interface is used implementation will execute only the methods in daoservice 
	public void save(Product prdt);
	public void update(Product prdt);
	public void delete(int product_Id);
	public Product getPrdt(int product_Id);
	public  List<Product> getProduct(String category);
	public List<Product> listProduct();
	
	
}


