package com.curso;

import java.util.*;

public class Principal2 {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas",28,45.67);
		Empleado e2 = new Empleado("Tercio",15,56.67);
		Empleado e3 = new Empleado("Andronico",30,49.67);
		
		List<Empleado> listEmpleadoList = new ArrayList<>();
		
		listEmpleadoList.add(e1);
		listEmpleadoList.add(e2);
		listEmpleadoList.add(e3); 
		
		Iterator<Empleado> iteratorEmp = listEmpleadoList.iterator();
		
		while (iteratorEmp.hasNext()) {  
			Empleado e = iteratorEmp.next();
			System.out.println(e);
		}
	}
		

}
