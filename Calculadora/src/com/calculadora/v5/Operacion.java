package com.calculadora.v5;

public class Operacion {
	
	int x;
	int y;
	
	Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int ejecuta(){
		return 0;
	}

	@Override
	public String toString() {
		return "Operacion [x=" + x + ", y=" + y + "]";
	}
	
	

}
