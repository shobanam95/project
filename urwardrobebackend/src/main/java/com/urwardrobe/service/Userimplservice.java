package com.urwardrobe.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.urwardrobe.dao.UserDao;
import com.urwardrobe.model.UserForm;



@Service




public class Userimplservice implements UserService {
	@Autowired	
private UserDao Userdao;
	
public UserDao getUserdao() {
	return Userdao;
}
	
public void setUserdao(UserDao userdao) {
	Userdao = userdao;
}

	@Transactional
	public void save(UserForm user) {
		Userdao.save(user);
	
	}
	
@Transactional
public void delete(UserForm user) {
	Userdao.delete(user);
	
}

	



@Transactional
public void update(UserForm user) {
	Userdao.update(user);
	
}

@Transactional
public List<UserForm> list() {
	return list();
}

}

	