package com.curso.v2;

public class Text implements Observer {
	
	private String cadena;

	public Text(String cadena) {
		this.cadena = cadena;
	}
	
	void showText() {
		System.out.println("Text: "+cadena);
	}

	@Override
	public void update() {
		showText();
	}

}
