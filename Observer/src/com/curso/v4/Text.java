package com.curso.v4;

public class Text extends Observer {
	
	private String cadena;

	public Text(String cadena, Subject sub) {
		super(sub);
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
