package com.curso;

import java.util.Arrays;

public class Principal2 {

	public static void main(String[] args) {

		Empleado[] empleados = {
				new Empleado("Patrobas",28,45.67),
				new Empleado("Tercio",15,56.67),
				new Empleado("Andronico",19,40.50),
				new Empleado("Rolas",21,60.03)
		};
		
		Arrays.sort(empleados);
		
		for(Empleado e: empleados) {
			System.out.println(e);
		}
		
		
	}

}
