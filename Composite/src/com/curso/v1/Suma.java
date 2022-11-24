package com.curso.v1;

public class Suma implements ComponentExpresion {
	
	String x;
	String y;

	public Suma(String x, String y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getValor() {
		return x.length()+y.length();
	}

	
	
}
