package com.curso.v2;

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
