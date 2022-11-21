package bloqueIni;

public class Principal {
	
	
	
	Principal(){
		System.out.println("Paso por Constructor");
	}

	public static void main(String[] args) {

		System.out.println("Hola Mundo");
		
		Principal p = new Principal();
	}
	
	static {
		System.out.println("Paso por bloque de Inicialización 1 static");
	}
	
	{
		System.out.println("Paso por bloque de Inicialización 2");
	}

	{
		System.out.println("Paso por bloque de Inicialización 1");
	}
	
	static {
		System.out.println("Paso por bloque de Inicialización 2 static");
	}
}
