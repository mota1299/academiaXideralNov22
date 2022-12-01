package com.demo.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		/*
		List<Empleado> listaEmpleados1 = Arrays.asList(
				new Empleado("Patrobas",28,45.67),
				new Empleado("Tercio",15,56.67),
				new Empleado("Andronico",19,40.50),
				new Empleado("Rolas",17,60.03)
				);
		
		List<Empleado> listaEmpleados2 = List.of(
				new Empleado("Patrobas",28,45.67),
				new Empleado("Tercio",15,56.67),
				new Empleado("Andronico",19,40.50),
				new Empleado("Rolas",17,60.03)
				);
		*/

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",21,60.03));
		
		System.out.println("-----EDAD MAYOR A 20----------");

		//DEFINICION
		PredicadoEmpleado p = emp -> emp.getEdad() > 20;
		
		for(Empleado e :listaEmpleados) {
			if (p.probar(e))
				System.out.println(e);
		}
		System.out.println("-----SUELDO MAYOR A 50----------");
		p = x -> x.getSueldo() > 50;
		
		for(Empleado e :listaEmpleados) {
			if (p.probar(e))
				System.out.println(e);
		}
		
		
	}

}
