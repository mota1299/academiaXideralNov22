package com.curso.v2;

public class Imagen implements Observer {
	
	private String img;

	public Imagen(String img) {
		this.img = img;
	}
	
	void showImage() {
		System.out.println("Img: "+img );
	}

	@Override
	public void update() {
		showImage();
	}

}
