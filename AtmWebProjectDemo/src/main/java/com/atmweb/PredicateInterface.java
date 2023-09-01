package com.atmweb;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Predicate<Integer> pr = new Predicate<Integer>() {
//
//			
//			public boolean test(Integer n) {
//				
//				if(n%2 ==0)
//					return true;
//				return false;
//			}
//			
//		};
		
		Predicate<Integer> pr =  n ->  n%2 == 0;	
		if(pr.test(10)) {
			System.out.println("Even Numbers");
		} else {
			System.out.println("Odd Numbers");
		}
		
		Predicate<String> pr1 = str -> str.length()>5;
		if(pr1.test("Apple")) {
			System.out.println("More than s characters; condition true");
		} else {
			System.out.println("Less than s characters; condition false");

		}

	}

}
