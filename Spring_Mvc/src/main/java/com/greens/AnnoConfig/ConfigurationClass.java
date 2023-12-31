package com.greens.AnnoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.greens.AnnoConfig")

public class ConfigurationClass {
	
	@Bean
	
	public InternalResourceViewResolver getView() {
		
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/");
		view.setSuffix(".jsp");
		
		return getView();
		
		
	}

	

}
