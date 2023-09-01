package com.atmweb;
@FunctionalInterface 
interface Vehicle{
	String model(String name);
}
public class LamdaExperssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = n ->  n.toUpperCase();
		
		
				
			
		
		String n= obj.model("Thar");
		System.out.println(n);
	}

}
