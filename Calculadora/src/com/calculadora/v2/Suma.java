package com.calculadora.v2;

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
