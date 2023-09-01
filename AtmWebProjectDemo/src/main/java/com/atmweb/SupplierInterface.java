package com.atmweb;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Supplier<Integer> supply = new Supplier <Integer>() {
//
//			public Integer get() {
//				return 6*6;
//			}
//			};
//			
//			System.out.println(supply.get());
		
		Supplier<Integer> supply = () -> 5*6;
				System.out.println(supply.get());
		 Supplier <String> supply1 = () -> "Java Application ";
		  System.out.println(supply1.get());
		  
		  Supplier<Date> date = ()-> new Date();
		  System.out.println(date.get());
		      
	}

}
