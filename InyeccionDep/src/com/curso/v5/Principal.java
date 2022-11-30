package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Tercio");
		
		Inyector.inyectaComputadora(bec1,1);
		
		bec1.encenderComputadora();
		
		Becario bec2 = new Becario("Patrobas");
		
		Inyector.inyectaComputadora(bec2,2);
		
		bec2.encenderComputadora();
		
		Becario bec3 = new Becario("Andronico");
		
		Inyector.inyectaComputadora(bec3,100);
		
		bec3.encenderComputadora();
	}

}
