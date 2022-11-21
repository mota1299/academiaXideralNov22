package inicio;

public class Principal {

	public static void main(String[] args) {

		String x = "Hello";
		//x = null;
		String y = "Hello";
		String z = "Hello World";
		
		System.out.println(x==y); //true
		System.out.println(y==z); //false
		
		//3 Objetos //INCORRECTO
		//3 Variables de Referencia
		
		String w = new String("Hello");
		
		//4 Objetos //INCORRECTO
		//4 Variables de Referencia.
		
		//2 Objetos //CORRECTO

		boolean res = x.equals(z); //true
		res = x.equals(w); //true
		System.out.println("1: "+res);
		
		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");
		//sb2 = null;
		res = sb1.equals(sb2); //false
		System.out.println("2: "+res);
		
		String s1 = new String("Hola");
		String s2 = new String("Hola");

		res = s1.equals(s2); //true
		System.out.println("3: "+res);
		
		res = s1 == s2; //false
		System.out.println("4: "+res);
		
	}

}
