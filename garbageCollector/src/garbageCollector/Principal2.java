package garbageCollector;

public class Principal2 {
	
	public static void main(String[] args) {
		Caja c1 = new Caja();
		Caja c2 = new Caja();
		Caja c3 = new Caja();
		
		c1.caja = c2;
		c2.caja = c3;
		c1 = null;
		
		//INVITACION PARA QUE SE EJECUTE
		//EL GARBAGE COLLECTOR
		System.gc();
		
		//Si se ejecuta GC
		
		//Objetos hay? 1,2,3 
		
		//2
		
		
	}

}
