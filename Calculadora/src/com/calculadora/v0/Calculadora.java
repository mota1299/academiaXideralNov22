package com.calculadora.v0;

public class Calculadora {

	public static void main(String[] args) {

		Suma ope1 = new Suma(8,4);
		Resta ope2 = new Resta(8,4);
		
		System.out.println(ope1.ejecuta());
		System.out.println(ope2.ejecuta());

	}

}
