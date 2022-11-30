package com.curso.v4;

public class Gif extends Observer {
	
	private String gif;

	public Gif(String gif, Subject sub) {
		super(sub);
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
