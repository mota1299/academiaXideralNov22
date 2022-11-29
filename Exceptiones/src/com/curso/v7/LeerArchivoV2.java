package com.curso.v7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivoV2 {

	public static void main(String[] args)  {
		File archivo = new File("/examen2.txt");
		try {
			leerArchivo(archivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Fin de programa");
	}

	private static void leerArchivo(File file) 
				throws FileNotFoundException {
		
		FileReader fr = new FileReader(file);
	}

}
