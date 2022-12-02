package com.curso;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		//AUTOBOXING
		List<Integer> list = Arrays.asList(1,2,3);
		
		List<Integer> list2 = Arrays.asList(
				Integer.valueOf(1),
				Integer.valueOf(2)
				);
		
		//UNBOXING
		int x = list2.get(1);
		
		for (int i : list) //UNBOXING
			System.out.println(i);
		
	}

}
