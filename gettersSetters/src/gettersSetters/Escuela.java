package gettersSetters;

public class Escuela {

	public static void main(String[] args) {

		Alumno a1 = new Alumno("Patrobas",4,new StringBuilder("XY100"));
		Alumno a2 = new Alumno("Tercio",8,new StringBuilder("WO100"));
		Alumno a3 = new Alumno("Rolas",10,new StringBuilder("46100"));
		
		//a2.nombre = "Andronico";
		a2.setNombre("Andronico");
		//a2.edad = -20;
		a2.setEdad(-20);
		System.out.println(a2.getNombre());
		System.out.println(a2.getEdad());

		
	}

}
