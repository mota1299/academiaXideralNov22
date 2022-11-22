package com.calculadora.v1;

public class Suma extends Operacion {
	
	Suma(int x, int y) {
		super(x,y);
	}
	
	//OVERRIDING
	//SOBREESCRITURA
	
	@Override
	int ejecuta(){
		return x + y;
	}

}
