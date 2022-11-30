package com.curso.v1;

public class Imagen extends Observer {
	
	private String img;

	public Imagen(String img) {
		this.img = img;
	}
	
	void showImage() {
		System.out.println("Img: "+img );
	}

	@Override
	void update() {
		showImage();
	}

}
