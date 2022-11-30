package com.curso.v7;

public class CompuDummy extends Computadora {

	public CompuDummy(String version) {
		super(version);
	}

	@Override
	public void encender() {
		System.out.println("Compu Dummy: "+version+
				" Encendida.");
	}
	
}
