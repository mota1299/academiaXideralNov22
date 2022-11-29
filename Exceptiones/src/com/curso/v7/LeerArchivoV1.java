package com.curso.v7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivoV1 {

	public static void main(String[] args) {
		File archivo = new File("/examen2.txt");
		leerArchivo(archivo);
		System.out.println("Fin de programa");
	}
	
	private static void leerArchivo(File file) {
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Paso por el catch FileNotFoundException");
		}
	}

}
