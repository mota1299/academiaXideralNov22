package com.curso.demos;

import java.util.*;
import java.util.function.*;

public class PrincipalFuncion {

	public static void main(String[] args) {

		Function<String,Integer> fun1 = s -> s.length();
		int r = fun1.apply("JavaMaster");
		System.out.println(r);
		
		Function<Empleado,String> fun2 = e -> e.getNombre();
		Empleado emp = new Empleado("Patrobas",28,56.79);
		System.out.println(fun2.apply(emp));
		
		Function<String,String> fun3 = s -> s.substring(5);
		System.out.println(fun3.apply("CursoJava"));
		
		UnaryOperator<String> uo1 = x -> x.concat(x);
		System.out.println(uo1.apply("CursoJava"));
		
		List<String> listaNombres = Arrays.asList(
				"Patrobas","Tercio","Andronico");
		
		listaNombres.replaceAll(n -> "Alumno ".concat(n));
		listaNombres.forEach(x -> System.out.println(x));
		
		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		listaEmpleados.replaceAll(e -> {
			e.setSueldo(e.getSueldo()+10);
			System.out.println(e);
			return e;
		});
		System.out.println("-------------");

		listaEmpleados.removeIf(e -> e.getSueldo()<50);
		listaEmpleados.forEach(System.out::println);
		
	}

}
