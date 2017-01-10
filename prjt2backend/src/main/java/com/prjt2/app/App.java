package com.prjt2.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prjt2.dao.User2Dao;
import com.prjt2.model.User2;

public class App {
@Autowired
	
	public static void main(String[] args){
		
		

		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.prjt2.config");
		context.refresh();
		User2Dao user2bean = (User2Dao) context.getBean("user2bean");
		User2 u2 = new User2();
		u2.setUsername_2("Shobi");
		
		u2.setPassword_2("pswd");
		u2.setConfirmpassword_2("pswd");
		u2.setPhno_2("pswd");
		u2.setEmail_2("shobi123@gmail.com");
		user2bean.save(u2);
		System.out.println(user2bean);
		
		
	}
	
	
}
