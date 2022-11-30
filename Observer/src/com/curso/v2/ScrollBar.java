package com.curso.v2;

public class ScrollBar implements Observer {
	
	void desplazar() {
		System.out.println("Desplazar ScrollBar");
	}

	@Override
	public void update() {
		desplazar();
	}

}
