package com.curso.v3;

public class Inyector {
	
	static Computadora cd = new CompuDummy("Dummy");
	static Computadora cw = new CompuWindows("XP");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	static void inyectaComputadora(Becario b,int tipoCompu){
		
		switch(tipoCompu) {
		
		case 1: b.compu = cw;
			break;
		case 2: b.compu = cl;
			break;
		default: b.compu = cd;
		}
		
	}

}
