package objetoInmutable;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Usar un constructor para asignar los valores del objeto.
 * 2. Asignar a todas las variables de la instancia las propiedades private y final.
 * 3. No asignar setters.
 * 4. No permitir que las referencias de los objetos inmutables puedan ser modificadas o accedidas directamente
 * 5. No permitir que los métodos sean sobreescritos y/o definir la clase como final
 * */

public final class Perro {
	private final String nombre;
	private final StringBuilder raza;
	private final List<String> comida;
	
	public Perro(String nombre, StringBuilder raza, List<String> comida ) {
		this.nombre = nombre;
		this.raza = new StringBuilder(raza);
		this.comida = new ArrayList<>(comida);
	}

	public String getNombre() {
		return nombre;
	}

	public List<String> getComida() {
		return new ArrayList<>(comida);
	}

	public StringBuilder getRaza() {
		return new StringBuilder(raza);
	}
	
	public void comer() {
		System.out.println(nombre + "comiendo");
	}
}
