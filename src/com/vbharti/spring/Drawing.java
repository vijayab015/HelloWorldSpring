package com.vbharti.spring;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
	final static Logger logger = Logger.getLogger(Drawing.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
		//BeanFactory beanfactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		triangle.draw();
		triangle.display();
		
		/*
		 * DBoperation dbope=(DBoperation) context.getBean("dbope"); try {
		 * dbope.dbopen(); } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); };
		 */
	}

}
