package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Tercio");
		
		bec1.encenderComputadora("linux");
		
		Becario bec2 = new Becario("Patrobas");
		
		bec2.encenderComputadora("windows");
	}

}
