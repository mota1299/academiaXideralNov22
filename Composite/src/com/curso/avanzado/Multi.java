package com.curso.avanzado;

public class Multi implements ComponentExpresion {
	
	ComponentExpresion ceDerecho;
	ComponentExpresion ceIzquierdo;

	public Multi(ComponentExpresion x, ComponentExpresion y) {
		ceDerecho = x;
		ceIzquierdo = y;
	}

	@Override
	public double getValor() {
		return ceDerecho.getValor() * ceIzquierdo.getValor();
	}

	
	
}
