package com.spring._Hibernate_Project_Mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Mobiles {
	
	@Id
	
	private int mobid;
	private String mobModel;
	
	
	@ManyToMany
	private List<Student>  student = new ArrayList<>();
	
	
	public List<Student>  getStudent() {
		return student;
	}
	public void setStudent(List<Student>  student) {
		this.student = student;
	}
	public int getMobid() {
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public String getMobModel() {
		return mobModel;
	}
	public void setMobModel(String mobModel) {
		this.mobModel = mobModel;
	}
	public Mobiles(int mobid, String mobModel) {
		super();
		this.mobid = mobid;
		this.mobModel = mobModel;
	}
	@Override
	public String toString() {
		return "Mobiles [mobid=" + mobid + ", mobModel=" + mobModel + "]";
	}
	
	public Mobiles() {
		
	}

}
