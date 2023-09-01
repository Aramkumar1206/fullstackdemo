package com.spring.AnnotConfig;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
		
//		car bean = context.getBean(car.class);
//		
//		car car = (car)context.getBean("car");
		
		//AnnotationContext configuration;
		
		
		
		car car= context.getBean("car",car.class);
		
		car.display();
		
		
		
		
		

	}

}
