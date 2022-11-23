package com.primitivos;

public class Principal2 {

	public static void main(String[] args) {

		boolean eyesClosed = false; 
		boolean breathingSlowly = true;

		boolean resting = eyesClosed | breathingSlowly; 
		boolean asleep = eyesClosed & breathingSlowly; 
		//boolean awake = eyesClosed ^ breathingSlowly; 
		//System.out.println(resting); // true 
		//System.out.println(asleep); // true 
		//System.out.println(awake); // false
		
		String cadena = "XY";
		
		//System.out.println(cadena!=null); //false
		//int size = cadena.length();
		//System.out.println(size);
		
		if (cadena!=null && cadena.length()>1) 
			System.out.println("PASO1");
		else
			System.out.println("PASO2");
		
		int rabbit = 6; 
		boolean bunny = (rabbit >= 6) || (++rabbit <= 7); 
		//System.out.println(rabbit);
		
		int a = 2, b = 4, c = 2;

		System.out.println(a > 2 ? --c : b++); //4
		System.out.println(c);
		//B=5 //C=2
		
		/*
		System.out.println(b = (a!=c ? a : b++)); //5
		System.out.println(b); //5
		//B= 5 
		*/
		System.out.println(a > b ? (b < c ? b : 2 ): 1);
		//1
		
	}

}
