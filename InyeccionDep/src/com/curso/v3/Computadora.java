package com.curso.v3;

public abstract class Computadora {
	
	String version;
	
	public Computadora(String version) {
		this.version = version;
	}
	
	abstract void encender();

}
