package com.curso.v2;

public class Gif implements Observer {
	
	private String gif;

	public Gif(String gif) {
		this.gif = gif;
	}
	
	void showGif() {
		System.out.println("Gif: "+gif);
	}

	@Override
	public void update() {
		showGif();
	}

}
