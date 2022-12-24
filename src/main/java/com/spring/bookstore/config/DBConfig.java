package com.spring.bookstore.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jakarta.activation.DataSource;

public class DBConfig {
	@Bean(name="dataSource")
	
	public DriverManagerDataSource getH2DataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.driver");
		dataSource.setUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");
		
		System.out.println("---dataSource object is created---");
		return dataSource;
	}
	
	@Bean(name = "sessionFactory")
	
	public SessionFactory getSessionFactory() {
		
		Properties hibernateProp = new Properties();
		
		hibernateProp.put("hibernate.hdm2dd1.auto", "update");
		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.h2Dialect");
		
	}
}
