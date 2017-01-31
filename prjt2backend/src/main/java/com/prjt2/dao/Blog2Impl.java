package com.prjt2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.prjt2.model.Blog2;

public class Blog2Impl implements  Blog2Dao{
	
	@Autowired
	private SessionFactory session;

	@Transactional
	public void save(Blog2 blog) {
		Session session = this.session.getCurrentSession();
		session.save(blog);
		session.flush();
	}

	@Override
	public void update(Blog2 blog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Blog2 blog) {
		// TODO Auto-generated method stub
		
	}

}
