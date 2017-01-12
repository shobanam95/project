package com.prjt2.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prjt2.model.User2;


@Repository
public class User2Impl implements User2Dao {

	@Autowired
	private SessionFactory sessionfactory;
	
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	
	@Transactional
	public void save(User2 user2) {
		
	Session session = sessionfactory.getCurrentSession();
	user2.setRole_2("User");
	
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

@Transactional
public List<User2> getUser(String username_2, String password_2) {
	Session session = this.sessionfactory.getCurrentSession();
	Criteria criteria = session.createCriteria(User2.class);
	System.out.println("checking@Dao"+"  "+username_2);
	System.out.println(password_2);
	criteria.add(Restrictions.and(Restrictions.eq("username_2",username_2), Restrictions.eq("password_2",password_2)));
	//Query criteria1=session.createQuery("from User2 u where u.username_2='"+username_2+"' and u.password_2='"+password_2+"'" );
	List<User2> list1 = criteria.list();
	System.out.println("list"+" "+list1);
	return list1;
}

}

