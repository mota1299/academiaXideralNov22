package com.statico.metodo;

public class Principal {
	
	public static void main(String[] args) {
		
		//Principal p = new Principal();
		//System.out.println(p.sumar(4,5));
		System.out.println(new Principal().sumar(4,8));
		
		//System.out.println(Principal.resta(6, 4));
		System.out.println(resta(6, 4));
	}
	
	public int sumar(int x, int y) {
		return x + y;
	}
	
	public static int resta(int x, int y) {
		return x - y;
	}

}
