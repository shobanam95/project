package com.urwardrobe.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.urwardrobe.model.UserForm;
@Service
public interface UserService {
	
	public void save(UserForm user);
	public void delete(UserForm id );
	
	public void update(UserForm user);
	public List<UserForm> list();
}
