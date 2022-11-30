package com.curso.v4;

public class Becario {
	
	private String nombre;
	private Computadora compu;

	public Becario(String nombre, Computadora compu) {
		this.nombre = nombre;
		this.compu = compu;
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
