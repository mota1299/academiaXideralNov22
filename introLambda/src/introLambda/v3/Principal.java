package introLambda.v3;

public class Principal {

	public static void main(String[] args) {
		int x = 8;
		int y = 4;
		double resultado = 0;
		
		Operacion ope1 = (a,b) -> a+b;
		resultado = ope1.ejecuta(x,y);
		System.out.println(resultado);
		
		Operacion ope2 = (a,b) -> a*b;
		resultado = ope2.ejecuta(x,y);
		System.out.println(resultado);
		
		Operacion ope3 = (a,b) -> Math.pow(a, b);
		resultado = ope3.ejecuta(x, y);
		System.out.println(resultado);
		
		
	}

}
