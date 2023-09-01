package com.grenns.Rest_API_Demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.grenns.Rest_API_Demo.Model.Student;



public class StudentRepository {

	public List<Student> getAllAtudents() {
		
		List<Student> stuList = new ArrayList<>();
		
		Student emp = new Student(101,"python",23);
		
		Student emp1 =  new Student(102,"Java",25);
		
		stuList.add(emp);
		stuList.add(emp1);
		stuList.add(new Student(103,"ram",23));
		stuList.add(new Student(104,"pad",22));
		stuList.add(new Student(105,"ajay",22));
		stuList.add(new Student(106,"hari",23));
		
		
		return stuList;
	}

}
