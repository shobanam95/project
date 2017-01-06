package com.prjt2.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.prjt2.dao.User2Dao;
import com.prjt2.dao.User2Impl;



@Configuration 




@EnableTransactionManagement
public class AppConfig {
	


	//bean ---> object

	

		//SessionFactory ---> Interface
	//factory stores multiple sessions(many data source)	
		
		
	@Autowired
	@Bean
			public LocalSessionFactoryBean sessionFactory() {
	 	  		
	 	  		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();//user defined class
	 	  		sessionFactory.setDataSource(getDataSource());
	 	  		sessionFactory.setHibernateProperties(hibernateProperties());
	 	  		sessionFactory.setPackagesToScan("com.prjt2.model");
	 	  		System.out.println("model");
	 	  		return sessionFactory;
		   }

		
		   @Bean(name = "dataSource")
		   public DataSource getDataSource() {
			    BasicDataSource dataSource = new BasicDataSource();
			   System.out.println("datasource");
			dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			dataSource.setUsername("PRJT");
			dataSource.setPassword("123");
			System.out.println("check datasource");
			return dataSource;
			}
		   
	//Transaction manager ---> role back and commit. Manages transaction process 
		   // role back ---> unsuccessful transaction
		   //commit ---> successful transaction
		   
		 
		 
		 
		  
		 
		   private Properties hibernateProperties() {
				Properties properties = new Properties();
				System.out.print("oracle");
				properties.put("hibernate.show_sql", "true");
				properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");//This property makes Hibernate generate the appropriate SQL for the chosen database.
				properties.put("hibernate.hbm2ddl.auto","update");//hibernate.hbm2ddl.auto Automatically validates or exports schema DDL to the database when the SessionFactory 
																//is created. With create-drop, the database schema will be dropped when the SessionFactory is closed explicitly.
				//validate: validate the schema, makes no changes to the database.
				//update: update the schema.
				//create: creates the schema, destroying previous data.
				//create-drop: drop the schema at the end of the session.
			System.out.println("check oracle");
				return properties;
		   }
		   
		   
		   @Bean
		   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		       HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		       transactionManager.setSessionFactory(sessionFactory().getObject());
		       return transactionManager;
		   }
		   
		   @Bean(name="user2bean")
		   public User2Dao user2bean() {
			   System.out.println("bean");
				return new User2Impl();
			}
		   
		   
		   
		   
		  
		 }


