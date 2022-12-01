package com.curso.demos;

import java.util.*;
import java.util.function.*;

public class DemosLambdas {
	
	public static void main(String[] args) {
		
		//SUPPLIER
		Supplier<String> sup1 = () -> "Hola Mundo";
		Supplier<Integer> sup2 = () -> Integer.valueOf(5);
		
		String s = sup1.get();
		Integer i = sup2.get();
		System.out.println(s + " " + i);
		
		Supplier<Empleado> sup3 = () -> new Empleado("Rolas",17,10.03);
		Empleado emp = sup3.get();
		System.out.println(emp);
		
		//CONSUMER
		Consumer<String> c1 = x -> System.out.println(x);
		c1.accept("Hola");
		
		Consumer<Integer> c2 = y -> System.out.println(y+100);
		c2.accept(9);
		
		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		listaEmpleados.forEach(x -> System.out.println(x));
		//listaEmpleados.forEach(System.out::println);
	}

}
