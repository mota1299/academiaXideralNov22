package com.calculadora.v1;

public class Calculadora {

	public static void main(String[] args) {

		Operacion ope0 = new Operacion(8,4);
		Suma ope1 = new Suma(8,4);
		Resta ope2 = new Resta(8,4);
		Multi ope3 = new Multi(8,4);
		
		System.out.println(ope0.ejecuta());
		System.out.println(ope1.ejecuta());
		System.out.println(ope2.ejecuta());
		System.out.println(ope3.ejecuta());

	}

}
