package com.curso.v2;

public class CompuLinux extends Computadora {

	public CompuLinux(String version) {
		super(version);
	}

	@Override
	public void encender() {
		System.out.println("Compu Linux: "+version+
				" Encendida.");
	}
	
}
