package com.curso.v4;

public class ScrollBar extends Observer {
	
	ScrollBar(Subject sub){
		super(sub);
	}
	
	void desplazar() {
		System.out.println("Desplazar ScrollBar");
	}

	@Override
	public void update() {
		desplazar();
	}

}
