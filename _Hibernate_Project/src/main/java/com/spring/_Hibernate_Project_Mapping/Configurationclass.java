package com.spring._Hibernate_Project_Mapping;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Configurationclass {

	public static void main(String[] args) {
		
		
		Mobiles moto = new Mobiles();
		moto.setMobid(200);
		moto.setMobModel("moto 10 edge");
		
		Mobiles app = new Mobiles();
		app.setMobid(500);
		app.setMobModel("apple 14pro max");
		
		Mobiles red = new Mobiles();
		red.setMobid(800);
		red.setMobModel("redmi note 10 pro");
		
		Student stu = new Student();
		stu.setId(101);
		stu.setName("arunnn");
		stu.setAge(23);
		stu.getMobile().add(moto);
		stu.getMobile().add(app);
		stu.getMobile().add(red);
		
		Student stu1 =new Student() ;
		
		stu1.setId(105);
		stu1.setName("affjf");
		stu1.setAge(27);
		stu1.getMobile().add(moto);
		stu1.getMobile().add(app);
		stu1.getMobile().add(red);
		
		Student stu2 =new Student() ;
		stu2.setId(107);
		stu2.setName("arkkk");
		stu2.setAge(29);
		stu2.getMobile().add(moto);
		stu2.getMobile().add(app);
		stu2.getMobile().add(red);
		
		
		moto.getStudent().add(stu);
		moto.getStudent().add(stu1);
		moto.getStudent().add(stu2);
		
		app.getStudent().add(stu);
		app.getStudent().add(stu1);
		app.getStudent().add(stu2);
		
		red.getStudent().add(stu);
		red.getStudent().add(stu1);
		red.getStudent().add(stu2);
		
		
		
		
//		moto.setStudent(stu);
//		app.setStudent(stu);
//		red.setStudent(stu);
		
		
		Session session = new Configuration().configure().addAnnotatedClass(Student.class).
		addAnnotatedClass(Mobiles.class).buildSessionFactory().openSession();
		
		session.beginTransaction();
		session.save(moto);
		session.save(app);
		session.save(red);
		session.save(stu);
		session.save(stu1);
		session.save(stu2);
		session.getTransaction().commit();
		session.close();

	}

}
