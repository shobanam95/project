package com.urwardrobeappquick.urwardrobebackend;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.annotation.Bean;

import com.urwardrobe.dao.DaoService;
import com.urwardrobe.dao.UserDao;
import com.urwardrobe.model.Product;
import com.urwardrobe.model.UserForm;

import com.urwardrobe.service.Userimplservice;




public class App 
{
	
	
	

	public static void main(String args[])
	{
		
		System.out.println("one");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println("one");
		
		context.scan("com.urwardrobe.confiig");
		context.refresh();
	
		UserDao userbean = (UserDao)context.getBean("userbean");
		System.out.println("one");	
		 
			DaoService prdtbean = (DaoService)context.getBean("prdtbean");

	
		
	}
}
	