package com.calculadora.v4;

import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		Operacion ope4 = new Division(8,4);
		
		List<Operacion> listaOperacion = new ArrayList<>();
		listaOperacion.add(ope4);
		listaOperacion.add(ope0);
		listaOperacion.add(ope1);
		listaOperacion.add(ope2);
		listaOperacion.add(ope3);
	
		//POLIMORFISMO
		for(Operacion o:listaOperacion) {
			System.out.println(o.toString());
			System.out.println(o.ejecuta());
		}
	}

}
