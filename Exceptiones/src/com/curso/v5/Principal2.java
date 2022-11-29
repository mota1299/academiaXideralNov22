package com.curso.v5;

public class Principal2 {

	public static void main(String[] args) throws CeroException, NegativoException  {
		int res = 0;
		int x = 8;
		int y = 0;

		res = calcular(x, y);
		
		System.out.println("Res: " + res);
		
	}

	private static int calcular(int x, int y) throws CeroException,NegativoException {
		if(y == 0)
			throw new CeroException("No se puede dividir entre cero");
		if(y < 0 || x < 0)
			throw new NegativoException("No se permiten resultados con negativo");
		return x / y;
	}
}
