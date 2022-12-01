package com.demo;

public class Principal {

	public static void main(String[] args) {

		//Predicado p = new Predicado();
		
		//DEFINIENDO
		Predicado p = new Predicado(){
			@Override
			public boolean probar(String cadena) {
				return cadena.length()>5;
			}			
		};
		
		//EJECUTAR
		boolean r = p.probar("Hola");
		System.out.println(r);
		
		p = new Predicado(){
			@Override
			public boolean probar(String cadena) {
				return cadena.contains("x");
			}			
		};
		
		r = p.probar("Mexico");
		System.out.println(r);
		
	}

}
