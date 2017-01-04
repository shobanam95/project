package com.prjt2.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.prjt2.model.User2;

public class User2Impl implements User2Dao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Transactional
	public void save(User2 user2) {
	Session session = this.sessionfactory.openSession();
	session.save(user2);
	session.flush();

	}
@Transactional
	public void update(User2 user2) {
		Session session = this.sessionfactory.openSession();
		session.update(user2);
		session.flush();

	}
@Transactional
	public void getBy2Id(int id_2) {
		Session session = this.sessionfactory.openSession();
		session.get(User2.class,id_2);
		session.flush();

	}

}
