package com.curso.v1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Estacion e = getEstacion();
		
		switch(e) {
		
		case PRIMAVERA: 
			System.out.println("Muchos visitantes");
			break;
		case OTONO: 
			System.out.println("Pocos visitantes");
			break;
		case VERANO:
			System.out.println("Variable visitantes");
			break;
		default:
			System.out.println("Cerrado");
		}
		System.out.println("*************");
		
		String[] arrayEstaciones = new String[4];
				
		for (Estacion est : Estacion.values()) {
			System.out.println(est.name());
			System.out.println(est.ordinal());
			arrayEstaciones[est.ordinal()] = est.name();
		}
		System.out.println("*************");

		System.out.println(Arrays.toString(arrayEstaciones));
	}

	private static Estacion getEstacion() {
		return Estacion.VERANO;
	}

}
