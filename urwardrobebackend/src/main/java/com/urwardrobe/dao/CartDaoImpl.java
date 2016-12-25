package com.urwardrobe.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.urwardrobe.model.AddressDetails;
import com.urwardrobe.model.Cart;
import com.urwardrobe.model.CartItem;
import com.urwardrobe.model.Customer;

public class CartDaoImpl implements CartDao {
	@Autowired
	private SessionFactory sessionfactory;
@Transactional
	public void save(Cart cart) {
	Session session = this.sessionfactory.getCurrentSession();
	session.save(cart);
	session.flush();
	
	}
@Transactional
	public void update(Cart cart) {
		Session session = this.sessionfactory.getCurrentSession();
		session.update(cart);
		session.flush();
		
	}
@Transactional
	public void getCartById(int cart_Id) {
		Session session = this.sessionfactory.getCurrentSession();
	session.get(Cart.class, cart_Id);
	session.flush();
		
	}

@Transactional
public void save(Customer cus) {
Session session = this.sessionfactory.getCurrentSession();
session.save(cus);
session.flush();

}

@Transactional
public void save(AddressDetails add) {
Session session = this.sessionfactory.getCurrentSession();
session.save(add);
session.flush();

}
@Transactional
public void save(CartItem ci){
	Session session = this.sessionfactory.getCurrentSession();
	session.save(ci);
	session.flush();
}

	

}
