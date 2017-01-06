package com.prjt2.dao;

import java.util.List;

import com.prjt2.model.User2;

public interface User2Dao {
	public void save(User2 user2);
	public void update(User2 user2);
	public void getBy2Id(int id_2);
	public List<User2> getUser(String username_2,String password_2);
}
