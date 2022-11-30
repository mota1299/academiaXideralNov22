package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		Becario b = Inyector.getBecario("Patrobas",99);
		
		b.encenderComputadora();
	}

}
