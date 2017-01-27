package com.prjt2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prjt2.dao.User2Dao;

import com.prjt2.model.User2;

@RestController
public class Controller2 {

	HttpSession session;
	private User2Dao user2bean;
	
	public Controller2(){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.prjt2.config");
		context.refresh();
		user2bean = (User2Dao) context.getBean("user2bean");
		
		}
	
	
	
	
	

	@RequestMapping(value="/register/{username_2}/{email_2}/{password_2}/{confirmpassword_2}/{phno_2}", method = RequestMethod.POST) 
	public ResponseEntity add(@PathVariable String username_2,@PathVariable String email_2,@PathVariable String password_2,@PathVariable String confirmpassword_2,@PathVariable String phno_2) {
	try{	
	
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




	@RequestMapping(value="/log",method=RequestMethod.POST)
	public ResponseEntity<User2>check(@RequestBody User2 user,@PathVariable String username_2,@PathVariable String password_2){
		System.out.println("check");
		List<User2> list =user2bean.getUser(username_2,password_2);
		System.out.println(list);
			if(list!=null){
			
			System.out.println(username_2);
			System.out.println(password_2);
			return new ResponseEntity<User2>((User2) list,HttpStatus.OK);
			}
			else{
				
				return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
}
	
	
}
