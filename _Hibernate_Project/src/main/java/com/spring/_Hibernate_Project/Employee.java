package com.spring._Hibernate_Project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Employee_Details")
//@Table(name= "Employee_Details")
public class Employee {
	
	@Id
	@Column(name="Emp_ID")
	private int id;
	@Column(name="Emp_name")
	private String name;
	@Column(name="Emp_age")
	private int age;
	
	
	@ElementCollection
	private List<Address> address = new ArrayList<>();
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
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
	public Employee(int id, String name, int age,List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public Employee() {
		
	}
	
}

@Embeddable

class Address {
	private int dNo;
	private String stName;
	private String area;
	public int getdNo() {
		return dNo;
	}
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Address(int dNo, String stName, String area) {
		super();
		this.dNo = dNo;
		this.stName = stName;
		this.area = area;
	}
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", stName=" + stName + ", area=" + area + "]";
	}
	
	
}
	
	


