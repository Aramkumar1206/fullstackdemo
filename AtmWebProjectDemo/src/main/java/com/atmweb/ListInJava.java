package com.atmweb;

import java.util.LinkedList;

public class ListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(30);
		list.add(39);
		list.add(33);
		list.add(63);
		list.add(38);
		list.add(03);
		list.add(33);
		list.add(32);
		
		list .forEach(n-> System.out.println(n));
		
		

	}

}
