package com.curso.v2;

enum Estacion {
	
	PRIMAVERA("alto"), 
	OTONO("poco"), 
	VERANO("variable"), 
	INVIERNO("sinVisitantes");
	
	private String visitantes;
	
	Estacion(String visitantes){
		this.visitantes = visitantes;
	}
	
	public void mostrarVisitantes() {
		System.out.println(visitantes);
	}

}
