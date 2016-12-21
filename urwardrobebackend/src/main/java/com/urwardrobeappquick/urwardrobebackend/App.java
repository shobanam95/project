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



public class App 
{


	private static final int List = 0;

	@SuppressWarnings({ "resource", "unused", "unchecked" })
	public static void main(String args[])
	{
		
		System.out.println("one");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.urwardrobe.confiig");
		context.refresh();
			
		UserDao userbean = (UserDao)context.getBean("userbean");
		DaoService prdtbean = (DaoService)context.getBean("prdtbean");
		CartDao cartbean = (CartDao) context.getBean("cartbean");
	Cart cart = new Cart();
	
		
	Product product = new Product();
		
	Customer cus = new Customer();
		cus.setCustomer_Email("shobana@gmail.com");
		cus.setAddress_Details("Address");
		cus.setCustomer_Name("shobana");
		cus.setCustomer_Number(10298929);
		cus.setCart(cart);

	AddressDetails add = new  AddressDetails();
		add.setCity("cbe");
		add.setCountry("India");
		add.setState("TN");
		add.setHouse_Number("10");
		add.setZipCode("8383");
		add.setCustomer(cus);
		add.setStreet_Name("street");
	
	CartItem ci = new CartItem();
		ci.setCartitem_Quantity(10);
		ci.setCartitem_TotalPrice(1000);
		ci.setProduct(product);
		ci.setCart(cart);
		
		CartItem ci2 = new CartItem();
		ci2.setCartitem_Quantity(1);
		ci2.setCartitem_TotalPrice(1);
		ci2.setProduct(product);
		ci2.setCart(cart);
	
	List<CartItem> check =  new ArrayList<CartItem>();
	
	check.add(ci2);
	check.add(ci);
		
		cart.setCustomer(cus);
		cart.setCartitem(check);
		cart.setTotal(10000);
		prdtbean.save(product);
		cartbean.save(cart);
		
		
		
	}
	
}
	