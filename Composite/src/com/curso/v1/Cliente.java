package com.curso.v1;

public class Cliente {

	public static void main(String[] args) {

		ComponentExpresion e1 = new LeafConstante(2.0);
		ComponentExpresion e2 = new LeafConstante(3.0);
		ComponentExpresion e3 = new LeafConstante(4.0);
		
		System.out.println(e1.getValor());
		System.out.println(e2.getValor());
		System.out.println(e3.getValor());

		
	}

}
