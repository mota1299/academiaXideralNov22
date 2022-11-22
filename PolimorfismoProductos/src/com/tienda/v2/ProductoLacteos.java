package com.tienda.v2;

public abstract class ProductoLacteos implements Producto {
	
	private String codigo;
	private double precio;
	private double porcentajeMayoreo = 0.20;
	private double porcentajeMenudeo = 0.05;

	public ProductoLacteos(String codigo,double precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public double getPrecioMayoreo(int cantidad) {
		return precio*cantidad*(1-porcentajeMayoreo);
	}
	
	public double getPrecioMenudeo(int cantidad) {
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
