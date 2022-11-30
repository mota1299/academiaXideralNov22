package com.curso.v3;

public class Mouse extends Subject {
	
	@Override
	void click() {
		System.out.println("Click");
		notificar();
	}

}
