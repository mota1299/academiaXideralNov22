package com.curso.demos;

import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface Funcion {
	
		Map<String,Integer> 
			aplicar(List<String> lista,int[] arrayInts);

}
