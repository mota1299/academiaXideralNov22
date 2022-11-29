package com.curso.v9;

public class Principal {

	public static void main(String[] args)  {

		System.out.println("PASO1");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("PASO2");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("PASO3");

	}

}
