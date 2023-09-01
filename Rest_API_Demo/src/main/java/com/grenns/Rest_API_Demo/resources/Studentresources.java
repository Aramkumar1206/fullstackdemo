package com.grenns.Rest_API_Demo.resources;

import java.util.List;

import com.grenns.Rest_API_Demo.Model.Student;
import com.grenns.Rest_API_Demo.repository.StudentRepository;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class Studentresources {
	
	StudentRepository repo = new StudentRepository();
	
	  @GET
	    @Produces(MediaType.APPLICATION_XML)
	    public List<Student> getAllStudents() {
		  
		  System.out.println("Students Resource Called...!!!");
	        return repo.getAllAtudents();
	    }

}
