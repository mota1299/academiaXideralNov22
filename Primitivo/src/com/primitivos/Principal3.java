package com.primitivos;

public class Principal3 {

	public static void main(String[] args) {

		int dayOfWeek = 6;

		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Weekday");
		}
		
		for (int counter = 4; counter >= 0; counter--) { 
			System.out.print(counter + " "); 
		}//4 3 2 1 0
	}

}
