package com.spring._Hibernate_ProjectHQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class ConfigClass {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure()
				.addAnnotatedClass(Trainers.class).buildSessionFactory();
		
       Session session = sf.openSession();
       
       session.beginTransaction();
       
       for (int i=0,j=21;i<=10;i++,j++) {
    	   
    	   Trainers trainer = new Trainers();
    	   trainer.setName("FULL STACK TRAINERS" +i);
    	   trainer.setAge(j);
    	   
    	   session.save(trainer);
    	 
       }
       
       session.getTransaction().commit();
       session.close();
		
		
		

		

	}

}
