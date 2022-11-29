package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		int res = 0;
		int x = 8;
		int y = 0;

		res = calcular(x, y);
		System.out.println("Res: " + res);
		
	}

	private static int calcular(int x, int y) {
		if(y == 0)
			throw new CeroException("No se puede dividir entre cero");
		return x / y;
	}
}
