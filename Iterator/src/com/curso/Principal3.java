package com.curso;

import java.util.*;

public class Principal3 {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Patrobas",28,45.67);
		Empleado e2 = new Empleado("Tercio",15,56.67);
		Empleado e3 = new Empleado("Andronico",30,49.67);
		
		Map<String,Empleado> mapEmpleados = new HashMap<>();
		
		mapEmpleados.put("AX07", e1);
		mapEmpleados.put("AZ06", e2);
		mapEmpleados.put("RT06", e3);

		Iterator<Empleado> iteratorEmp = mapEmpleados.values().iterator();
		
		while (iteratorEmp.hasNext()) {  
			Empleado e = iteratorEmp.next();
			System.out.println(e);
		}
		
		Iterator<String> iteratorString = mapEmpleados.keySet().iterator();
		
		while (iteratorString.hasNext()) {  
			String e = iteratorString.next();
			System.out.println(e);
		}
		System.out.println("*************");
		mapEmpleados.forEach((x,y)-> System.out.println(
				"CveEmpleado :"+x+"; "+y));
		
	}
		

}
