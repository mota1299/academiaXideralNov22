package com.tienda.v2;

public class Queso extends ProductoLacteos {
	
	public Queso(String codigo, double precio) {
		super(codigo, precio);
	}

	@Override
	public double comprar(int cantidad) {
		if (cantidad >= 10)
			return getPrecioMayoreo(cantidad);
		else
			return getPrecioMenudeo(cantidad);
	}
	

}
