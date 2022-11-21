package inicio;

public class Principal2 {

	public static void main(String[] args) {
		
//		String s = "Hello"; //INMUTABLE
//		s = "Hola";
//		s = s.concat(" World");
//		System.out.println(s);
//		
//		StringBuilder sb1 = 
//				new StringBuilder("Hello"); //MUTABLE
//		sb1.append(" World");
//		sb1.insert(0, "Beca ");
//		System.out.println(sb1);
		
		
		String s = "Hello"; //INMUTABLE
		StringBuilder sb = new StringBuilder("Hello"); //MUTABLE
		int i = 10; //PRIMITIVO
		
		cambiar(s,sb,i);
		
		System.out.println(s); //Hello World //Hello
		System.out.println(sb); //Hello World 
		System.out.println(i); //15 //10
		
		
	}
	
	public static void cambiar(String s, StringBuilder sb, int i) {
		s.concat(" World");
		sb.append(" World");
		i = i + 5;
		
		//System.out.println(s); //Hello World //Hello
		//System.out.println(sb); //Hello World
		//System.out.println(i); //15
	}
}
