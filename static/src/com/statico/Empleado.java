package com.statico;

public class Empleado {
	
	//ATRIBUTOS, PROPIEDADES
	// ** DE INSTANCIA DE CLASE U OBJETO **
	String nombre; //null
	
	// ** CLASE **
	static int contador; //0
	
	Empleado(String nombre){
		this.nombre = nombre;
		contador = contador + 1;
	}

}
