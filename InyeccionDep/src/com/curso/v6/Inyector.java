package com.curso.v6;

public class Inyector {
	
	static Computadora cd = new CompuDummy("Dummy");
	static Computadora cw = new CompuWindows("XP");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	static void inyectaComputadora(Becario b,TipoComputadora tc){
		
		switch(tc) {
		
		case WINDOWS: b.setCompu(cw);
			break;
		case LINUX: b.setCompu(cl);
			break;
		default: b.setCompu(cd);
		
		}
		
	}

}
