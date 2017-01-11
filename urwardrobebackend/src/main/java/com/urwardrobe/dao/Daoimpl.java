package com.urwardrobe.dao;


import java.util.List;



import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.urwardrobe.model.Product;

@Repository

public class Daoimpl  implements DaoService {
	


	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
@Autowired
	
	private SessionFactory sessionfactory;
	
	
	@Transactional
	
	public void save(Product prdt) {
		Session session = this.sessionfactory.getCurrentSession();
		session.save(prdt);
		
		  System.out.println("Inserted Successfully");
		
		 }
		
@Transactional
	public void update(Product prdt) {
		Session session = this.sessionfactory.getCurrentSession();
		
		
		  session.update(prdt);
		session.flush();
		  System.out.println("Updated Successfully");
		  		  
		 }	
		


@SuppressWarnings("unchecked")
@Transactional
public List<Product> listProduct() {
	Session session = sessionfactory.openSession();
	List<Product> prdtlist = session.createQuery("from Product").list();
	 
	
	return prdtlist;


}
@Transactional
public Product getPrdt(int product_Id) {
	Session session = this.sessionfactory.getCurrentSession();
	Product product = (Product) session.get(Product.class, product_Id);
	System.out.println(product);
	return product;
}


@Transactional
public void delete(int product_Id) {
	
	Session session = this.sessionfactory.getCurrentSession();
	Product prdt = (Product) session.get(Product.class, product_Id);
	session.delete(prdt);
	
			
	  
	  
}	
		@Transactional
		@SuppressWarnings("unchecked")
		public  List<Product> getProduct(String category){
			Session session = this.sessionfactory.getCurrentSession();
			Criteria criteria = session.createCriteria(Product.class);
			criteria.add(Restrictions.eq("category", category));
			
			List<Product> list = criteria.list();
			return list;
		}
	}

	

	

