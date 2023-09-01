package com.spring.AnnotConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //("Tyre2")
@Primary


public class Apollo implements Vechicleparts {

	public void tyre () {
		
		System.out.println("I'm using Apollo tyres");
		
	}

}
