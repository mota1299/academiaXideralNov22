package com.calculadora.v9;

import java.util.*;

public class Calculadora {
	
	static int x = 8; 
	static int y = 4; 
	
	public static void main(String[] args) {
						
		List<Operacion> listaOperacion = new ArrayList<>();
		listaOperacion.add(new Multi(9,3));
		listaOperacion.add(new Suma(x,y));
		listaOperacion.add(new Resta(x,y));
		listaOperacion.add(new Multi(x,y));
		listaOperacion.add(new Division(x,y));
			
		//POLIMORFISMO
		for(Operacion o:listaOperacion) {
			System.out.println(o);
			System.out.println(o.ejecuta());
			if (o instanceof Multi)
				System.out.println("SOY UNA MULTI");
			
		}
	}

}
