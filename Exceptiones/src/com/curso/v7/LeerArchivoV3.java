package com.curso.v7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivoV3 {

	public static void main(String[] args) 
			throws FileNotFoundException  {
		File archivo = new File("/examen2.txt");
		
		leerArchivo(archivo);
		
		System.out.println("Fin de programa");
	}

	private static void leerArchivo(File file) 
				throws FileNotFoundException {
		
		FileReader fr = new FileReader(file);
	}

}
