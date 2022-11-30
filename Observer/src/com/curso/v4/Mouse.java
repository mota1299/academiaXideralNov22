package com.curso.v4;

public class Mouse extends Subject {
	
	@Override
	void click() {
		System.out.println("Click");
		notificar();
	}

}
