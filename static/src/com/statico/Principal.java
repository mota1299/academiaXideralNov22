package com.statico;

public class Principal {

	public static void main(String[] args) {
		
		//System.out.println(Empleado.contador);

		Empleado e1 = new Empleado("Patrobas");
		System.out.println(Empleado.contador);
		
		Empleado e2 = new Empleado("Andronico");
		System.out.println(Empleado.contador);

		Empleado e3 = new Empleado("Tercio");
		System.out.println(Empleado.contador);

		Empleado e4 = new Empleado("Pancrasio");
		System.out.println(Empleado.contador);

		System.out.println(Empleado.contador); //4
		System.out.println(Empleado.contador); //4
		System.out.println(Empleado.contador); //4
		System.out.println(Empleado.contador); //4

	}

}
