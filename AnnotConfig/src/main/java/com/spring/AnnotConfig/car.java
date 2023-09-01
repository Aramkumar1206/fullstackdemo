package com.spring.AnnotConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class car {
	
	@Value("${name}")
	
	String model;
	
	@Autowired

	@Qualifier ("ceat")
	
	Vechicleparts tyre;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Vechicleparts getTyre() {
		return tyre;
	}

	public void setTyre(Apollo tyre) {
		this.tyre = tyre;
	}

	public  void display (){
		
		System.out.println("car Model ="+model);
		tyre.tyre();

	}

}
