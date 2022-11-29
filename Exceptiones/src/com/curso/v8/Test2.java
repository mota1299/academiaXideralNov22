package com.curso.v8;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[])  {

		Scanner scn = new Scanner(System.in);

		int n = Integer.parseInt(scn.nextLine());
		System.out.println("int: " + n);
		if (99 % n == 0)
			System.out.println(n + " is a factor of 99");

		System.out.println("Programa continua");

		// String cadena = scn.nextLine();
		// System.out.println("Captura: "+cadena);

//		try {
//			int n = Integer.parseInt(scn.nextLine());
//
//			if (99 % n == 0)
//				System.out.println(n + " is a factor of 99");
//		} catch (ArithmeticException ex) {
//			System.out.println("Arithmetic " + ex);
//		} catch (NumberFormatException ex) {
//			System.out.println("Number Format Exception " + ex);
//		}
	}
}