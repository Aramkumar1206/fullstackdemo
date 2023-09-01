package com.spring.AnnotConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.AnnotConfig")
@PropertySource("classpath:application.properties")


public class Configure {
	
	@Bean("car")
	
	public car getCar() {
		
		return new car();
		
	}

}
