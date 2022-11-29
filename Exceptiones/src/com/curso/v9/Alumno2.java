package com.curso.v9;

public class Alumno2 implements AutoCloseable {

	public static void main(String[] args) throws Exception {

		try (Alumno2 alu = new Alumno2()) {
			System.out.println(alu);
			
			Thread.sleep(5000); //Dormir 5 segundos
		}
		Thread.sleep(3000); //Dormir 3 segundos
		System.out.println("Programa continua...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Cerrar recurso Alumno");
	}

	@Override
	public String toString() {
		return "Alumno []";
	}	
}
