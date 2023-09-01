package com.atmweb;

interface Vehicles {
	void model ();
}

class Mahindra {
	public void getModel() {
		
		System.out.println("Method Reference");
		System.out.println("Mahindra Thar...!!!" );
	}
}

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Vehicles car = new Vehicles() {
//			
//			@Override
//			public void model() {
//                
//				System.out.println("Mahindra Thar");
//				
//			}
//		};
//		
//		car.model();
		
		//Lamda Experssion
		
		Mahindra mahi = new Mahindra();
		
//		Vehicles car = () -> System.out.println("Mahindra Thar Gold");
		
		Vehicles car = () -> mahi.getModel();
		car.model();

	}

}
