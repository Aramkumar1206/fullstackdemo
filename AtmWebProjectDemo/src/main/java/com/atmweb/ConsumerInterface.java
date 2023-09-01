package com.atmweb;

import java.util.function.Consumer;
public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Consumer<String> con = new Consumer<String> () {
//
//			
//			public void accept(String t) {
//			  System.out.println(t.toUpperCase());
//				
//			}	
//		};
//		
//		con.accept("Java Application");
//		
//		Consumer <Integer> con1 = new Consumer <Integer> () {
//
//			
//			public void accept(Integer n) {
//				System.out.println(n*n);
//			 	
//			}
//			
//		};
//
//		con1.accept(6);
		
		Consumer<String> con = t -> System.out.println(t.toUpperCase());	
		con.accept("Java Application");
		Consumer <Integer> con1 = n ->System.out.println(n*n);
		con1.accept(5);
		
	}

}
