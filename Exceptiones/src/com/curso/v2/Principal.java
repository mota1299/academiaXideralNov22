package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		int res = 0;
		int x = 8;
		int y = 4;

		try {
			res = calcular(x, y);
			System.out.println("Res: " + res);
	
			int[] arrayInt = { 3, 4, 5 };
			System.out.println(arrayInt[1]);
	
			String cadena = "Hola";
			res = cadena.length();
			
			//Intencionalmente se arroja una Exception
			throw new UnsupportedOperationException();
			
		}catch(ArithmeticException e){
			System.out.println("No se pudo ejecutar la división");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index no existe");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("Cadena no existe");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Contacte al Admin");
			e.printStackTrace();
		}
		finally {
			System.out.println("continue......");
		}
		
		System.out.println("FIN DE PROGRAMA");
		
	}

	private static int calcular(int x, int y) {
		return x / y;
	}
}
