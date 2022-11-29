package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		int res=0;
		int x=8;
		int y=0;
		
		try {
			res = calcular(x,y);
		}
		catch(ArithmeticException e) {
			System.out.println("No se pudo ejecutar la división");
		}
		
		System.out.println("Res: "+res);
						
		int[] arrayInt = {3,4,5};
		
		try {
			System.out.println(arrayInt[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index no existe");
		}
		
		try {
			String cadena = null;
			res = cadena.length();
		}catch(NullPointerException e) {
			System.out.println("Cadena no existe");
		}				
	}

	private static int calcular(int x, int y) {
		return x/y;
	}
}
