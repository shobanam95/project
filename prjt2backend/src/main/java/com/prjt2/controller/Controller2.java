package com.prjt2.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.prjt2.dao.User2Impl;
import com.prjt2.model.User2;

@RestController
public class Controller2 {

	private User2Impl user2bean;
	
	@RequestMapping(value= "/register/{username_2}", method = RequestMethod.POST) 
	public ResponseEntity add(@PathVariable String username_2) {
		
	
	try{
		System.out.println("2");
		User2 user1 = new User2();
		user1.setUsername_2(username_2);
		System.out.println("3");
	user2bean.save(user1);
	System.out.println(user1);
		 
		 
	return new ResponseEntity(HttpStatus.OK);
	}
catch(Exception E){
	System.out.println(E);
	return new ResponseEntity(HttpStatus.FORBIDDEN);	
}
	
	
}
}