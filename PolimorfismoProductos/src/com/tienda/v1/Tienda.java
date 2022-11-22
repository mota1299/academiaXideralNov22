package com.tienda.v1;

import java.util.*;

public class Tienda {

	public static void main(String[] args) {
		List<Producto>listaProductos = getProductos();
		
		for(Producto prod:listaProductos) {
			System.out.println(prod.getCodigo());
			System.out.println(prod.getPrecio());
			System.out.println("TotalCompra: "+prod.comprar(10));
		}
		
	}
	
	static List<Producto> getProductos(){
		return List.of(
				new Queso("quesoXYZ",80.00),
				new Yogurt("yogTYU",90.10),
				new Yakult("yakult",10)
				);
	}

}
