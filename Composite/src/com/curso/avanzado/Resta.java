package com.curso.avanzado;

public class Resta implements ComponentExpresion {
	
	ComponentExpresion ceDerecho;
	ComponentExpresion ceIzquierdo;

	public Resta(ComponentExpresion x, ComponentExpresion y) {
		ceDerecho = x;
		ceIzquierdo = y;
	}

	@Override
	public double getValor() {
		return ceDerecho.getValor() - ceIzquierdo.getValor();
	}

	
	
}
