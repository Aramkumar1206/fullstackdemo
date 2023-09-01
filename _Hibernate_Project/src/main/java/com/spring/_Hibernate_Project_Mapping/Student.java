package com.spring._Hibernate_Project_Mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity

public class Student {
	
	@Id
	private int id;
	private String name;
	private int age;
	
	@ManyToMany
	private List<Mobiles> mobile = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Mobiles> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobiles> mobile) {
		this.mobile = mobile;
	}
	public Student(int id, String name, int age, List<Mobiles> mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public Student() {
		
	}

}
