package com.curso.v0;

public class Mouse {
	
	//ALTO ACOMPLAMIENTO
	Text text = new Text("Hola Mundo");
	Gif gif = new Gif("Duck");
	ScrollBar sb = new ScrollBar();
	
	void click() {
		System.out.println("Click");
		text.showText();
		gif.showGif();
		sb.desplazar();
	}

}
