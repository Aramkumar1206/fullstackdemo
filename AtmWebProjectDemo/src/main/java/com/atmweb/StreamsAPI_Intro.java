package com.atmweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPI_Intro {

	public static void main(String[] args) {
//		
//		List<Integer> list = new ArrayList<>();
//		
//		for(int i=1;i<=50;i++) {
//			list.add(i);
//		}
//        System.out.println(list);
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 
		                19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 
		                37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50);
		 List<Integer> odd = new ArrayList<>();
		 List<Integer> even = new ArrayList<>();
		 
		 for(int n:numbers) {
			 
			 if(n%2==0) {
				 even.add(n);
			 }else {
				 odd.add(n);
				 
			 }
		 }
		 System.out.println(odd);
		 System.out.println(even);
		 
		 Predicate<Integer> pr = n-> n%2==0;
		 
//		List<Integer> stream = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		 
		 numbers.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
//		List<Integer> stream1 = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
		 
		 numbers.stream().filter(n->n%2!=0).forEach(n-> System.out.println(n));
		
		System.out.println("Using Stream API...");
		
		System.out.println(even);
		System.out.println(odd);
		
		 
		 
		
		
	}

}
