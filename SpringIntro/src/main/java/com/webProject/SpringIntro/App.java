package com.webProject.SpringIntro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
//        Samsung sam = new Samsung();
//        sam.model();
        
        Mobiles mobile = (Mobiles)context.getBean("mobile");
//        Mobiles mobiles = (Mobiles)context.getBean("mobiles");
        mobile.model();
//        mobiles.model();
    }
}
