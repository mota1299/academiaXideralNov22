package com.curso.avanzado;

public class Division implements ComponentExpresion {
	
	ComponentExpresion ceDerecho;
	ComponentExpresion ceIzquierdo;

	public Division(ComponentExpresion x, ComponentExpresion y) {
		ceDerecho = x;
		ceIzquierdo = y;
	}

	@Override
	public double getValor() {
		return ceDerecho.getValor() / ceIzquierdo.getValor();
	}

	
	
}
