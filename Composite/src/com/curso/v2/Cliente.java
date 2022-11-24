package com.curso.v2;

public class Cliente {

	public static void main(String[] args) {

		ComponentExpresion e1 = new LeafConstante(2.0);
		ComponentExpresion e2 = new LeafConstante(3.0);

		ComponentExpresion e3 = new Suma(e1,e2);
		
		System.out.println(e3.getValor());
		
	}

}
