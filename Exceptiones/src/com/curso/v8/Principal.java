package com.curso.v8;

public class Principal {

	public static void main(String[] args) {
		int res = 0;
		int x = 1001;
		int y = 2;

		try {
			res = calcular(x, y);
		} catch (CeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		System.out.println("Res: " + res);
		
	}

	private static int calcular(int x, int y) throws CeroException,NegativoException {
		if(y == 0)
			throw new CeroException("No se puede dividir entre cero");
		else if(y < 0 || x < 0)
			throw new NegativoException("No se permiten resultados con negativo");
		else if(x>1000)
			throw new UnsupportedOperationException("x no puede ser mayor a 1000");
		return x / y;
	}
}
