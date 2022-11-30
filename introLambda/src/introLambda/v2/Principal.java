package introLambda.v2;

public class Principal {

	public static void main(String[] args) {
		int x = 8;
		int y = 4;
		int resultado = 0;
		
		Operacion ope1 = new Operacion() {
			@Override
			public int ejecuta(int a, int b) {
				return a+b;
			}
		};
		
		resultado = ope1.ejecuta(x, y);
		System.out.println(resultado);
		
		Operacion ope2 = new Operacion() {
			@Override
			public int ejecuta(int a, int b) {
				return a*b;
			}
		};
		
		resultado = ope2.ejecuta(x, y);
		System.out.println(resultado);
		
		Operacion ope3 = new Operacion() {
			@Override
			public int ejecuta(int a, int b) {
				return (int)Math.pow(a, b);
			}
		};
		
		resultado = ope3.ejecuta(x, y);
		System.out.println(resultado);
		
		
	}

}
