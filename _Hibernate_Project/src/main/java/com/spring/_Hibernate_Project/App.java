package com.spring._Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Address add = new Address();
    	add.setdNo(355);
    	add.setStName("jeyaram nagar 1st street");
    	add.setArea("Aruppukottai");
    	
    	Address add1 = new Address();
    	add1.setdNo(375);
    	add1.setStName("koviptti street");
    	add1.setArea("thirunelveli");
    	
        Employee emp = new Employee();
        emp.setId(104);
        emp.setName("Ajaykumar");
        emp.setAge(23);
        emp.getAddress().add(add);
        emp.getAddress().add(add1);
        
        Configuration cfg = new Configuration();
        cfg.configure();
        
        cfg.addAnnotatedClass(Employee.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        session.beginTransaction();
        session.save(emp);
//        Transaction transaction = session.getTransaction();
        session.getTransaction().commit();
        session.close();
        
    }
}
