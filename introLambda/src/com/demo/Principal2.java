package com.demo;

public class Principal2 {

	public static void main(String[] args) {
		
		//DEFINIENDO
		Predicado p = z -> z.length() > 5;
		
		//EJECUTAR
		boolean r = p.probar("Hola Mundo");
		System.out.println(r);
		
		p = w -> w.contains("x");
			
		r = p.probar("Japon");
		System.out.println(r);
		
	}

}
