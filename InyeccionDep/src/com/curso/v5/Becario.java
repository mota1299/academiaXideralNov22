package com.curso.v5;

public class Becario {
	
	private String nombre;
	private Computadora compu;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora(){
		System.out.println(nombre);
		compu.encender();
	}

	public Computadora getCompu() {
		return compu;
	}

	public void setCompu(Computadora compu) {
		this.compu = compu;
	}

}
