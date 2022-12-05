package objetoInmutable;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		List<String> listaComida = new ArrayList();
		listaComida.add("Pollo");
		listaComida.add("Croquetas");
		listaComida.add("Agua");

		Perro perro = new Perro("Duqueso", new StringBuilder("hola"), listaComida);
		
		System.out.println(perro.getNombre());
		System.out.println(perro.getRaza());
		System.out.println(perro.getComida());
		
		listaComida.add("Hueso");
		
		System.out.println("\n ---lista comida en perro---");
		listaComida.forEach(x -> System.out.println(x));
		
		System.out.println("\n----lista comida en perro----");
		System.out.println(perro.getComida());
		
		StringBuilder sb = perro.getRaza();
		sb.append("s");
		System.out.println(sb);
		System.out.println("-------");
		System.out.println(perro.getRaza());
	}
}
