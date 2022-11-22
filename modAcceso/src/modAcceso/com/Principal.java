package modAcceso.com;

import modAcceso.Empleado;

public class Principal {
	
	//Variable de Instancia de Clase
	Empleado emp = new Empleado();
	int x = 10;
	
	//UN METODO ESTATICO NO PUEDE USAR
	//ATRIBUTOS DE INSTANCIA DE CLASE DE FORMA DIRECTA
	
	public static void main(String[] args) {
		//Variables locales
		//Empleado empLocal = new Empleado();
		
		System.out.println(new Principal().x);
		System.out.println(new Principal().emp.nombre);
		

	}

}
