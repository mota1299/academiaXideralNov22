package com.calculadora.v6;

import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		
		List<Operacion> listaOperacion = new ArrayList<>();
		//listaOperacion.add(new Operacion(8,4));
		listaOperacion.add(new Suma(8,4));
		listaOperacion.add(new Resta(8,4));
		listaOperacion.add(new Multi(8,4));
		listaOperacion.add(new Division(8,4));
			
		//POLIMORFISMO
		for(Operacion o:listaOperacion) {
			System.out.println(o.toString());
			System.out.println(o.ejecuta());
		}
	}

}
