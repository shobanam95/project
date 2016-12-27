package com.urwardrobeappquick.urwardrobebackend;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.urwardrobe.dao.CartDao;
import com.urwardrobe.dao.DaoService;
import com.urwardrobe.dao.UserDao;
import com.urwardrobe.model.AddressDetails;
import com.urwardrobe.model.Cart;
import com.urwardrobe.model.CartItem;
import com.urwardrobe.model.Customer;
import com.urwardrobe.model.Product;
import com.urwardrobe.model.UserForm;



public class App 
{


	private static final int List = 0;

	@SuppressWarnings({ "resource", "unused", "unchecked" })
	public static void main(String args[])
	{
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.urwardrobe.confiig");
		context.refresh();
			
		UserDao userbean = (UserDao)context.getBean("userbean");
		DaoService prdtbean = (DaoService)context.getBean("prdtbean");
		CartDao cartbean = (CartDao) context.getBean("cartbean");
		Product product = new Product();
	Cart cart = new Cart();
	
		
	Customer cus = new Customer();
	cus.setCustomer_Email("shobi@gmail.com");
	cus.setCustomer_Name("Shobana");
	cus.setCustomer_Number(12345);
	cus.setAddress_Details("India");
	cus.setCustomer_Id(1);
	
	
	cartbean.save(cus);
	
	AddressDetails add = new  AddressDetails();
		add.setCity("cbe");
		add.setCountry("India");
		add.setState("TN");
		add.setHouse_Number("10");
		add.setZipCode("8383");
		add.setAddress_Id(1);
		add.setStreet_Name("street");
	cartbean.save(add);
	
	CartItem ci = new CartItem();
		ci.setCartitem_Quantity(10);
		ci.setCartitem_TotalPrice(1000);
		
		ci.setCartitem_Id(1);
	cartbean.save(ci);
	
	

		cart.setCart_Id(1);
		
		cart.setTotal(10000);
		
		cartbean.save(cart);
		
		
		
	}
	
}
	