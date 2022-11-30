package com.curso.v4;

public class Inyector {
	
	static Computadora cd = new CompuDummy("Dummy");
	static Computadora cw = new CompuWindows("XP");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	static Becario getBecario(String name,int tipoCompu){
		Becario b ;
		switch(tipoCompu) {
		
		case 1: b = new Becario(name,cw);
			break;
		case 2: b = new Becario(name,cl);
			break;
		default: b = new Becario(name,cd);
		}
		
		return b;
		
	}

}
