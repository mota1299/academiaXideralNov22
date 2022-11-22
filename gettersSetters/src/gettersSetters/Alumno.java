package gettersSetters;

public class Alumno {
	
	private String nombre;
	private int edad;
	private StringBuilder matricula;
	
	public Alumno(String nombre, int edad, StringBuilder matricula) {
		this.nombre = nombre;
		this.edad = edad;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad<10) 
			System.out.println("No se puede asignar la edad");
		else
			this.edad = edad;
	}

	public StringBuilder getMatricula() {
		//VALIDA SI TIENE EL ROL DE ADMIN
		return matricula;
	}

	public void setMatricula(StringBuilder matricula) {
		this.matricula = matricula;
	}
	
	

}
