package com.curso.v0;

public class Becario {
	
	String nombre;
	CompuWindows cw = new CompuWindows("WVista");

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora(){
		System.out.println(nombre);
		cw.encender();
	}

}
