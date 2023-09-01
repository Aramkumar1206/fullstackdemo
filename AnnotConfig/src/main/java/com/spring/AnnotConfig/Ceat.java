package com.spring.AnnotConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  //("Tyre1")
@Primary

public class Ceat  implements Vechicleparts{
	
	public void tyre() {
		System.out.println("currently switch to ceat tyres");
	}
	
	     

}
