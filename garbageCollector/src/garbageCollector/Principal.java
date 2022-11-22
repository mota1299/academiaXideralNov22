package garbageCollector;

public class Principal {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Tercio");
		Cliente c2 = new Cliente("Patrobas");
		Cliente c3 = c1;
		c1 = null;
		c2 = null;
		
		//Objetos 2 , 1
		//NO SE SABE
	}

}
