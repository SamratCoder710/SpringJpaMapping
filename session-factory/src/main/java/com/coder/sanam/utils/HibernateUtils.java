package com.coder.sanam.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.coder.sanam.entities.Family;
import com.coder.sanam.entities.House;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;
	
	private static SessionFactory buildJavaConfigSessionFactory() {
		try {
		Configuration configuration = new Configuration();
		
		Properties props = new Properties();
		props.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		props.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/file_db");
		props.put("hibernate.connection.username", "root");
		props.put("hibernate.connection.password", "Pochinkey#16");
		props.put("hibernate.current_session_context_class", "thread");
		props.put("hibernate.hbm2ddl.auto", "create");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", "true");
		
		configuration.setProperties(props);
		
		configuration.addAnnotatedClass(Family.class);
		configuration.addAnnotatedClass(House.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		return factory;
		}catch(Throwable ex) {
			System.err.println("Error in session factory creation"+ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null ) {
			sessionFactory = buildJavaConfigSessionFactory();
		}
		return sessionFactory;
	}

}
