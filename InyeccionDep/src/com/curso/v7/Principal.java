package com.curso.v7;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Tercio");
		
		Inyector.inyectaComputadora(bec1);
		
		bec1.encenderComputadora();
		
		Becario bec2 = new Becario("Patrobas");
		
		Inyector.inyectaComputadora(bec2);
		
		bec2.encenderComputadora();
		
		Becario bec3 = new Becario("Andronico");
		
		Inyector.inyectaComputadora(bec3);
		
		bec3.encenderComputadora();
	}

}
