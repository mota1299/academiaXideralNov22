package com.loop;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		//ARRAY VS ARRAYLIST
		
		int[] arrayInts = new int[8];
		arrayInts[0] = 1;
		arrayInts[1] = 2;
		arrayInts[2] = 3;

		String[] arrayNames = {"Raul","Paco","Rolas","Mary"};

		for (int x=0; x < arrayNames.length; x++) 
			System.out.println(arrayNames[x]);
		
		System.out.println("-------");
		
		for (int x= arrayNames.length-1; x >=0 ; x--) 
			System.out.println(arrayNames[x]);
		
		System.out.println("-------");
		//forEach
		for (String x : arrayNames )
			System.out.println(x);
		System.out.println("-------");

		
		List<String> values = new ArrayList<String>();

		values.add("Lisa"); 
		values.add("Kevin"); 
		values.add("Roger");
		values.add("Mike");


		for(String value : values) { 
			System.out.print(value + ", "); 
		}
		
		System.out.println("-------");

		values.forEach(System.out::println);
		
	}

}
