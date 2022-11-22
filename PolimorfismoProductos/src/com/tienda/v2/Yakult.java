package com.tienda.v2;

public class Yakult extends ProductoLacteos{
	
	public Yakult(String codigo, double precio) {
		super(codigo, precio);
	}

	@Override
	public double comprar(int cantidad) {
		if (cantidad >= 50)
			return getPrecioMayoreo(cantidad);
		else
			return getPrecioMenudeo(cantidad);
	}

}
