package com.atmweb;

import java.util.function.BiConsumer;

public class BiconsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BiConsumer<Integer,String> bicon = new BiConsumer <Integer,String> () {
//
//			
//			public void accept(Integer t, String u) {
//              System.out.println("Id: "+ t +"Name:" +u);				
//			}
//			
//		};
//		bicon.accept(101 , "Aura");
		
		BiConsumer<Integer,String> bicon = (t,u)-> System.out.println("Id: "+ t +"Name:" + u);	
		bicon.accept(101 , "Aura");

	}

}
