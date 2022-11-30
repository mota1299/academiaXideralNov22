package com.curso.v3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Observer obs1 = new Text("Hola Mundo");
		Observer obs2 = new Gif("Duck");
		Observer obs3 = new ScrollBar();
		Observer obs4 = new Imagen("EscudoMéxico");
		
		Subject m = new Mouse();

		m.attach(obs1);
		m.attach(obs2);
		m.attach(obs3);

		m.click();
		
		System.out.println("------------");
		m.detach(obs1);
		m.attach(obs4);
		
		m.click();
		
		System.out.println("------------");
		m.listaObservers = new ArrayList<>();
		
		m.click();
	}

}
