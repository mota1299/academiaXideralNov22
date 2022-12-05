package com.curso.search;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		int[] numbers = {1,9,4,2,8,6};
		Arrays.sort(numbers); //{1,2,4,6,8,9}
		System.out.println(Arrays.binarySearch(numbers, 2)); //1
		System.out.println(Arrays.binarySearch(numbers, 8)); //4
		
	}

}