package com.curso.v4;

public class Imagen extends Observer {
	
	private String img;

	public Imagen(String img, Subject sub) {
		super(sub);
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
