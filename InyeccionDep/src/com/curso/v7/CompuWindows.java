package com.curso.v7;

public class CompuWindows  extends Computadora {

	public CompuWindows(String version) {
		super(version);
	}

	@Override
	public void encender() {
		System.out.println("Compu Windows: "+version+
				" Encendida.");
	}
	
}
