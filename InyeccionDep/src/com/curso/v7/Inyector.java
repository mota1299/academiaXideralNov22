package com.curso.v7;

public class Inyector {
	
//	static Computadora cd = new CompuDummy("Dummy");
//	static Computadora cw = new CompuWindows("XP");
//	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	static void inyectaComputadora(Becario b){
		b.setCompu(getComputadora());
	}

	private static Computadora getComputadora() {
		
		//Computadora[] arrayCompu = {cd,cw,cl};
		Computadora[] arrayCompu = {new CompuDummy("Dummy"),
				new CompuWindows("XP"),
				new CompuLinux("Ubuntu 18")
		};
		
		int numero = (int)(Math.random() * arrayCompu.length);
		
		return arrayCompu[numero];
	}

}
