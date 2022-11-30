package com.curso.v1;

public class Becario {
	
	String nombre;
	CompuWindows cw = new CompuWindows("WVista");
	CompuLinux cl = new CompuLinux("Ubuntu 18");

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora(String tipoCompu){
		System.out.println(nombre);
		if (tipoCompu == "windows")
			cw.encender();
		else
			cl.encender();
	}

}
