package com.demo.v5;

import java.util.*;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",21,60.03));
		
		System.out.println("-----EDAD MAYOR A 20----------");		
		mostrarEmpleado(listaEmpleados,emp -> emp.getEdad() > 20);
		
		System.out.println("-----SUELDO MAYOR A 50----------");
		mostrarEmpleado(listaEmpleados,x -> x.getSueldo() > 50);

		System.out.println("-----NOMBRE LONGITUD MAYOR A 6----------");
		mostrarEmpleado(listaEmpleados,Z -> Z.getNombre().length() > 6);
		
		System.out.println("EMPLEADOS CUYO NOMBRE LONGITUD MAYOR A 6 Y GANA MAS DE 45");
		mostrarEmpleado(listaEmpleados, w -> w.getNombre().length()>6 
										&& w.getSueldo() > 45);
	
	
		Predicate<String> predString = s -> s.contains("x");
		Predicate<Double> predDouble = d -> d.equals(5.0);
		
		System.out.println(predString.test("USA"));
		System.out.println(predDouble.test(5.0));
	
	}
	
	static void mostrarEmpleado(List<Empleado> lista, 
			Predicate<Empleado> p ) {

		for(Empleado e :lista) {
			if (p.test(e)) //EJECUTA LA LAMBDA
				System.out.println(e);
		}
		
	}

}
