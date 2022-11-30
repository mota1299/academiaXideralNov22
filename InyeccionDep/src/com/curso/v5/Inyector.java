package com.curso.v5;

public class Inyector {
	
	static Computadora cd = new CompuDummy("Dummy");
	static Computadora cw = new CompuWindows("XP");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	static void inyectaComputadora(Becario b,int tipoCompu){
		
		switch(tipoCompu) {
		
		case 1: b.setCompu(cw);
			break;
		case 2: b.setCompu(cl);
			break;
		default: b.setCompu(cd);
		}
		
	}

}
