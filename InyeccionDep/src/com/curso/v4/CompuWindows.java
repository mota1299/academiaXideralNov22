package com.curso.v4;

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
