package com.curso.v4;

public class Principal {

	public static void main(String[] args) { // throws CeroException {
		int res = 0;
		int x = 8;
		int y = 2;

		try {
			res = calcular(x, y);
		} catch (CeroException e) {
			e.printStackTrace();
		}
		System.out.println("Res: " + res);
		
	}

	private static int calcular(int x, int y) throws CeroException {
		if(y == 0)
			throw new CeroException("No se puede dividir entre cero");
		return x / y;
	}
}
