package com.curso;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas",28,45.67);
		Empleado e2 = new Empleado("Tercio",15,56.67);
		Empleado e3 = new Empleado("Andronico",30,49.67);
		
		Set<Empleado> listEmpleadoSet = new HashSet<>();
		
		listEmpleadoSet.add(e1);
		listEmpleadoSet.add(e2);
		listEmpleadoSet.add(e3); 
		
		Iterator<Empleado> iteratorEmp = listEmpleadoSet.iterator();
		
		while (iteratorEmp.hasNext()) {  
			Empleado e = iteratorEmp.next();
			System.out.println(e);
		}
	}
		

}
