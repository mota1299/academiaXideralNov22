package com.curso.v7;

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
