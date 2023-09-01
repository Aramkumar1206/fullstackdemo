package com.webProject.SpringIntro;

public class I_Phone implements Mobiles{
	
     int id;
     String model;
     
     
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public void model() {
		
		System.out.println("Currently I'm using I-Phone 14 pro");
		
		System.out.println("mobile id=" +id+"Model = "+model);
	}

}
