package com.curso.v1;

public class Text extends Observer {
	
	private String cadena;

	public Text(String cadena) {
		this.cadena = cadena;
	}
	
	void showText() {
		System.out.println("Text: "+cadena);
	}

	@Override
	void update() {
		showText();
	}

}
