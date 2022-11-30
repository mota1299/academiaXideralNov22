package com.curso.v2;

public class Becario {
	
	String nombre;
	Computadora compu;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora(){
		System.out.println(nombre);
		compu.encender();
	}

}
