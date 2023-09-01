package com.webProject.SpringIntro;

import java.util.List;

//import javax.management.modelmbean.ModelMBeanInfoSupport;
//
//import org.springframework.ui.Model;

public class Samsung implements Mobiles{
	
	int id;
	String model;
	processor processor;
	List<String> modles;
	List<Customers> customer;
	
	public Samsung(int id ,String model,processor processor,List<String> modles,List<Customers> customer) {
		
		this.id = id;
		this.model = model;
		this.processor=processor;
		this.modles=modles;
		this.customer=customer;
		
		

	}
	
	public Samsung () {
		
	}
	public void model () {
		
		System.out.println("I'm Using samsung galaxy Note11");
		
		System.out.println("Mobile id=" + id +"Model = "+ model);
	    
		System.out.println(processor);
		
		System.out.println("************Available Models************");
		
		modles.stream().sorted().forEach(m->System.out.println(m));
		
		System.out.println("********Customer Details*********");
		
//		System.out.println(customer);
		
		for (Customers c: customer) {
			System.out.println(c);
			
		}
		
	}

	
	
	
	
}
