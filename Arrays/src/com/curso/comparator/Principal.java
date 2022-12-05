package com.curso.comparator;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Empleado[] empleados = {
				new Empleado("Patrobas",28,45.67),
				new Empleado("Tercio",15,56.67),
				new Empleado("Andronico",19,40.50),
				new Empleado("Rolas",21,60.03)
		};
		
		System.out.println("Ordernar por Edad");
		Arrays.sort(empleados, (e1,e2)->e2.getEdad()-e1.getEdad());
		
		for(Empleado e: empleados) {
			System.out.println(e);
		}
		
		System.out.println("Ordernar por Nombre");
		Arrays.sort(empleados, (e1,e2)->e1.getNombre().compareTo(e2.getNombre()));
		
		for(Empleado e: empleados) {
			System.out.println(e);
		}
		
		System.out.println("Ordernar por Sueldo");
		Arrays.sort(empleados, (e1,e2)-> (int)(e1.getSueldo() - e2.getSueldo()));
		
		for(Empleado e: empleados) {
			System.out.println(e);
		}
		
	}

}
