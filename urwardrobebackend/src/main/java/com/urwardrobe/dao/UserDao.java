package com.urwardrobe.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.urwardrobe.model.UserForm;

public interface UserDao {

	public void save(UserForm user);
	public void delete(UserForm id );
	public void update(UserForm user);
	
	public  List<UserForm> getUser(String username,String password);

}


//  List<Employee> employees = service.findAllEmployees();
//for (Employee emp : employees) {
  //  System.out.println(emp);
//}