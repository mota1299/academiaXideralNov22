package com.curso.demos;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		//DEFINICION
		Funcion f1 = (x,y) -> null;
		Map m = f1.aplicar(new ArrayList<>(),new int[0]);
		System.out.println(m);
		
		f1 = (z,w) -> new HashMap<String,Integer>();
		m = f1.aplicar(null,null);
		System.out.println(m);
		
		List<String> listaNombres = Arrays.asList(
				"Patrobas","Andronico","Tercio");		
		int[] arrayEdad = {12,23,34};
		
		//DEFINICION LAMBDA
		f1 = (r,t) -> {
			Map<String,Integer> mapa = new HashMap<>();
			int contador = 0;
			for(String nombre :r) {
				mapa.put(nombre, t[contador]+5);
				++contador;
			}
			return mapa;
		};
		
		//EJECUTAR LAMBDA
		m = f1.aplicar(listaNombres,arrayEdad);
		System.out.println(m);
		
	}

}
