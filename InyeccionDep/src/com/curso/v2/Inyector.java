package com.curso.v2;

public class Inyector {
	
	static CompuWindows cw = new CompuWindows("XP");
	
	static void inyectaComputadora(Becario b){
		b.compu = cw;
	}

}
