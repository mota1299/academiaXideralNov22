package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Tercio");
		
		Inyector.inyectaComputadora(bec1);
		
		bec1.encenderComputadora();
		
	
//		
//		Becario bec2 = new Becario("Patrobas");
//		
//		bec2.encenderComputadora();
	}

}
