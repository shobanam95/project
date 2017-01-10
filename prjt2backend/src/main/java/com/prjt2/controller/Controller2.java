package com.prjt2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.prjt2.dao.User2Dao;
import com.prjt2.dao.User2Impl;
import com.prjt2.model.User2;

@RestController
public class Controller2 {

	
	private User2Dao user2bean;
	
	public Controller2(){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.prjt2.config");
		context.refresh();
		user2bean = (User2Dao) context.getBean("user2bean");
		System.out.println("login controller");
		}
	
	
	
	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/register/{username_2}/{email_2}/{password_2}/{confirmpassword_2}/{phno_2}", method = RequestMethod.POST) 
	public ResponseEntity add(@PathVariable String username_2,String email_2,String password_2,String confirmpassword_2,String phno_2) {
	try{	
	System.out.println(username_2);
	System.out.println(password_2);
User2 user = new User2();
user.setUsername_2(username_2);
user.setConfirmpassword_2(confirmpassword_2);
user.setEmail_2(email_2);
user.setPassword_2(password_2);
user.setPhno_2(phno_2);
user2bean.save(user);
	System.out.println(user2bean);
	

return new ResponseEntity(HttpStatus.OK);
	}
	
	catch(Exception E){
		System.out.println(E);
		return new ResponseEntity(HttpStatus.FORBIDDEN);
	}
}


@RequestMapping(value="/login/{username_2}/{passsword_2}",method=RequestMethod.POST)
public ResponseEntity log(@PathVariable String username_2,String password_2){
	System.out.println("entering rest controller");
	try{
		
	
		List<User2> list = user2bean.getUser(username_2, password_2);
		
		if(!list.isEmpty()){
						return new ResponseEntity(list,HttpStatus.OK);
			}
		
		
	}
	catch(Exception E){
		
	}
	return new ResponseEntity(HttpStatus.FORBIDDEN);
	
}




}