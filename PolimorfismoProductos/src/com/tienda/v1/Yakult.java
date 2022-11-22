package com.tienda.v1;

public class Yakult implements Producto{
	
	private String codigo;
	private double precio;
	private double porcentajeMayoreo = 0.20;
	private double porcentajeMenudeo = 0.05;

	public Yakult(String codigo,double precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}
	
	@Override
	public double comprar(int cantidad) {
		if (cantidad >= 10)
			return getPrecioMayoreo(cantidad);
		else
			return getPrecioMenudeo(cantidad);
	}
	
	private double getPrecioMayoreo(int cantidad) {
		return precio*cantidad*(1-porcentajeMayoreo);
	}
	
	private double getPrecioMenudeo(int cantidad) {
		return precio*cantidad*(1-porcentajeMenudeo);
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	

}
