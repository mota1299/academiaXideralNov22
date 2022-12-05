package com.curso;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

		System.out.println(Arrays.toString(numbers));
		
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");
		System.out.println("*******");
		String[] strings2 = { "10","{"  ,"9", "100", "hola","HOLA"};
		// 10,100,9,HOLA,hola
		Arrays.sort(strings2);
		for (String string : strings2)
			System.out.print(string + " ");
	}

}
