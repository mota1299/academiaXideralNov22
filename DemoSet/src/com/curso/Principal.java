package com.curso;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas",28,45.67);
		Empleado e2 = new Empleado("Tercio",15,56.67);
		Empleado e3 = new Empleado("Patrobas",30,49.67);
		
		System.out.println(e1.equals(e3)); //true

		Set<Empleado> listaEmpleado = new HashSet<>();
		
		listaEmpleado.add(e1);
		listaEmpleado.add(e2);
		listaEmpleado.add(e3); //DUDA
		
		System.out.println(listaEmpleado.size()); //2
	}
		

}
