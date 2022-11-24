package com.curso.avanzado;

public class Cliente {

	public static void main(String[] args) {

		ComponentExpresion e = new Suma(
				new Resta(
						new LeafConstante(2.0)
						,
						new LeafConstante(3.0)
						)
				,new Multi(
						new LeafConstante(4.0)
						,
						new LeafConstante(5.0)
						)
				);
		
		System.out.println(e.getValor());
		
		ComponentExpresion eraiz = new Division(
				new Multi(
						new Resta(
								new LeafConstante(4),
								new LeafConstante(6)
						),
						new LeafConstante(200)
				)
				,
				new Suma(
						new LeafConstante(3),
						new LeafConstante(83)
				)	
		); //-4.65
		System.out.println(eraiz.getValor());
		
	}

}
