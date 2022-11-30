package com.curso.v2;

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
