package com.tienda.v0;

public class Tienda {

	public static void main(String[] args) {

		Queso prod1 = new Queso("quesoXYZ",80.00);
		double res = prod1.comprar(5);
		System.out.println(res);
		
		Yogurt prod2 = new Yogurt("yogTYU",90.10);
		res = prod2.comprar(15);
		System.out.println(res);
		
	}

}
