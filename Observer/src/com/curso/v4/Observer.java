package com.curso.v4;

abstract class Observer {
	
	Subject sub;
		
	public Observer(Subject sub) {
		this.sub = sub;
		sub.listaObservers.add(this);
	}
	
	abstract void update();
}
