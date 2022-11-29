package com.curso.v9;

public class Alumno {

	public static void main(String[] args) {

		Alumno alu = new Alumno();
		try {
			System.out.println(alu);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if (alu != null) {
				try {
					alu.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Programa continua...");
	}

	private void close() throws Exception {
		System.out.println("Cerrar recurso Alumno");
	}

	@Override
	public String toString() {
		return "Alumno []";
	}
	
}
