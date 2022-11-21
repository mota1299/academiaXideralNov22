package constructor;

public class Pato{
	
	String nombre;
	int edad;

	//SOBRECARGA DE CONSTRUCTORES
	//OVERLOADING
	
	Pato(){
		this("Lucas",3);
		System.out.println("Paso por Constructor Default");
	}

	public Pato(String nombre) {
		System.out.println("Paso por Constructor Nombre");
		this.nombre = nombre;
	}
	
	public Pato(String nombre, int edad) {
		System.out.println("Paso por Constructor Nombre");
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
