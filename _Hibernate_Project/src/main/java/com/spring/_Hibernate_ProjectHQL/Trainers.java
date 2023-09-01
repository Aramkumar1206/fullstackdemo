package com.spring._Hibernate_ProjectHQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="Trainers_Table")
@Table(name="Trainers_List")
public class Trainers {
	
	
	@Id 
	@GeneratedValue
	@Column(name="T_id")
	private int id;
	
	@Column(name="T_Name")
	private String name;
//	@Transient
	@Column(name="T_Age")
	private int age;
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
	public Trainers(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Trainers [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public Trainers() {
		
	}
	

}
