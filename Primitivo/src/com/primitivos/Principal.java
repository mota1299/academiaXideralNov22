package com.primitivos;

public class Principal {
	
	public static void main(String[] args) {
		
		float f = 6.5F;
		
		long l = 7888888888L;
		
		boolean b = false;
		
		int cookies = 4; 
		double reward = 3 + 2 * cookies--; 
		System.out.println("Zoo animal receives: "+reward+" reward points");
		
		int lion = 3; //4 //3
		int tiger = ++lion * 5 / lion--;
		//            4    * 5 /  4 = 5
		
		
		System.out.println("lion is " + lion); //3 //2 //4
		System.out.println("tiger is " + tiger); //5 //6 //6.66
		
		int x = 1;

		long y = 33;

		long z = x * y;
		
		double x1 = 39.21;

		float y1 = 2.1f;

		double z1 = x1 + y1;
		
		short x2 = 10; 
		short y2 = 3; 
		int z2 = x2 * y2;
		
		long l5 = 10;
		int i5 = (int)l5;
		
		double d5 = 10.0;
		float f5 = (float)d5;
		
		boolean b5 = true;
		boolean b4 = (boolean)b5;
	
		int i4 = 8;
		int i3 = (int)i4;
		
		short s2 = 8;
		int i2 = s2;
		
		short sh1 = 5;
		short sh2 = 4;
		
		//sh2 = (short)(sh1 + sh2);
		sh2 += sh1;
		System.out.println(sh2);
		
		System.out.println(Integer.MAX_VALUE);
	
		
	}

}
