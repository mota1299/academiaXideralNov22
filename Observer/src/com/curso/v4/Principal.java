package com.curso.v4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Subject m = new Mouse();

		Observer obs1 = new Text("Hola Mundo",m);
		Observer obs2 = new Gif("Duck",m);
		Observer obs3 = new ScrollBar(m);

		m.click();
		
		System.out.println("------------");
		Observer obs4 = new Imagen("EscudoMéxico",m);

		m.click();
		
		System.out.println("------------");
		m.listaObservers = new ArrayList<>();
		
		m.click();
	}

}
