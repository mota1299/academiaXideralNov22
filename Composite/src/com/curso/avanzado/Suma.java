package com.curso.avanzado;

public class Suma implements ComponentExpresion {
	
	ComponentExpresion ceDerecho;
	ComponentExpresion ceIzquierdo;

	public Suma(ComponentExpresion x, ComponentExpresion y) {
		ceDerecho = x;
		ceIzquierdo = y;
	}

	@Override
	public double getValor() {
		return ceDerecho.getValor() + ceIzquierdo.getValor();
	}

	
	
}
