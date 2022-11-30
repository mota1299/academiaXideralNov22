package com.curso.v6;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Tercio");
		
		Inyector.inyectaComputadora(bec1,TipoComputadora.WINDOWS);
		
		bec1.encenderComputadora();
		
		Becario bec2 = new Becario("Patrobas");
		
		Inyector.inyectaComputadora(bec2,TipoComputadora.LINUX);
		
		bec2.encenderComputadora();
		
		Becario bec3 = new Becario("Andronico");
		
		Inyector.inyectaComputadora(bec3,TipoComputadora.DUMMY);
		
		bec3.encenderComputadora();
	}

}
