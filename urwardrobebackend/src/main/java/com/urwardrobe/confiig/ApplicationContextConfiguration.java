package com.urwardrobe.confiig;
import java.util.Properties;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.urwardrobe.dao.CartDao;
import com.urwardrobe.dao.CartDaoImpl;
import com.urwardrobe.dao.DaoService;
import com.urwardrobe.dao.Daoimpl;
import com.urwardrobe.dao.UserDao;
import com.urwardrobe.dao.UserDaoimpl;


@Configuration 


@ComponentScan({ "com.urwardrobe.confiig" })

@EnableTransactionManagement

//bean ---> object

public class ApplicationContextConfiguration {

	//SessionFactory ---> Interface
//factory stores multiple sessions(many data source)	
	
	
@Autowired
@Bean
		public LocalSessionFactoryBean sessionFactory() {
 	  		System.out.println("2");
 	  		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();//user defined class
 	  		sessionFactory.setDataSource(getDataSource());
 	  		sessionFactory.setHibernateProperties(hibernateProperties());
 	  		sessionFactory.setPackagesToScan("com.urwardrobe.model");
 	  		return sessionFactory;
	   }

	   @Bean(name = "dataSource")
	   public DataSource getDataSource() {
		   System.out.println("6");
	       BasicDataSource dataSource = new BasicDataSource();
	       dataSource.setDriverClassName("org.h2.Driver");
	       dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	       dataSource.setUsername("sa");
	       dataSource.setPassword("");
	    	       return dataSource;
	   }
	   
	   
//Transaction manager ---> role back and commit. Manages transaction process 
	   // role back ---> unsuccessful transaction
	   //commit ---> successful transaction
	   
	 
	   @Bean
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	       HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	       transactionManager.setSessionFactory(sessionFactory().getObject());
	       return transactionManager;
	   }
	 
	  
	 
	   private Properties hibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");//This property makes Hibernate generate the appropriate SQL for the chosen database.
			properties.put("hibernate.hbm2ddl.auto","update");//hibernate.hbm2ddl.auto Automatically validates or exports schema DDL to the database when the SessionFactory 
															//is created. With create-drop, the database schema will be dropped when the SessionFactory is closed explicitly.
			//validate: validate the schema, makes no changes to the database.
			//update: update the schema.
			//create: creates the schema, destroying previous data.
			//create-drop: drop the schema at the end of the session.
		
			return properties;
	   }

	   @Bean(name="userbean")
	   public UserDao userbean() {
			return new UserDaoimpl();
		}
	   @Bean(name="prdtbean")
	   public DaoService prdtbean() {
			return new Daoimpl();

	   }
	   @Bean(name="cartbean")
	   public CartDao cartbean(){
		   return new CartDaoImpl();
		   
	   }
	 }
