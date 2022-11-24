package com.loop;

import java.util.Arrays;

public class Principal3 {

	public static void main(String[] args) {

		int[] resultado = new int[2];
		
		System.out.println(resultado.getClass().getSimpleName());

		resultado = getCordenada(100);
		
		//System.out.println(resultado[0]);
		//System.out.println(resultado[1]);

		System.out.println(Arrays.toString(resultado));
	}

	private static int[] getCordenada(int buscar) {
	
		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } }; 
		int[] array = {-1,-1};
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == buscar) {
					array[0] =i; 
					array[1] =j;
					return array;
				}
			}
		}
		return array;
	}

}
