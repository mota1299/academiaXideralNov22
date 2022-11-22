package com.tienda.v2;

public class Yogurt extends ProductoLacteos{
	
	public Yogurt(String codigo, double precio) {
		super(codigo, precio);
	}

	@Override
	public double comprar(int cantidad) {
		if (cantidad >= 100)
			return getPrecioMayoreo(cantidad);
		else
			return getPrecioMenudeo(cantidad);
	}

}
