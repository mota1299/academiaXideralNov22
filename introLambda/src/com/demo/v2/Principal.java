package com.demo.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",21,60.03));
		
		System.out.println("-----EDAD MAYOR A 20----------");
		PredicadoEmpleado p = emp -> emp.getEdad() > 20;
		
		mostrarEmpleado(listaEmpleados,p);
		
		System.out.println("-----SUELDO MAYOR A 50----------");
		p = x -> x.getSueldo() > 50;
		
		mostrarEmpleado(listaEmpleados,p);

		System.out.println("-----NOMBRE LONGITUD MAYOR A 6----------");
		p = Z -> Z.getNombre().length() > 6;
		
		mostrarEmpleado(listaEmpleados,p);
	}
	
	static void mostrarEmpleado(List<Empleado> lista, 
			PredicadoEmpleado p ) {

		for(Empleado e :lista) {
			if (p.probar(e)) //EJECUTA LA LAMBDA
				System.out.println(e);
		}
		
	}

}
