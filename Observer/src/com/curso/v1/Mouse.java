package com.curso.v1;

import java.util.ArrayList;
import java.util.List;

public class Mouse {
	
	List<Observer> listaObservers = new ArrayList<>();
	
	void attach(Observer o) {
		listaObservers.add(o);
	}
	
	void detach(Observer o) {
		listaObservers.remove(o);
	}
	
	void notificar() {
		for (Observer o:listaObservers) {
			o.update();
		}
	}
	
	void click() {
		System.out.println("Click");
		notificar();
	}

}
