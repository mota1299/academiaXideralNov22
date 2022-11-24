package com.loop;

public class FindInMatrix2 {
	
	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 2, 5 }, { 2, 2 } }; 

		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		 
			ETIQUETA: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					System.out.println("i: "+i);
					System.out.println("j: "+j);
					//1,0 //continue
					//2,0 //continue
					
					//1,0 //break
					continue ETIQUETA;
				}
			}
		}
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");

		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");

		}

	}
}