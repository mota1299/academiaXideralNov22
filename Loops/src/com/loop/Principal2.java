package com.loop;

public class Principal2 {

	public static void main(String[] args) {

		int[][] myComplexArray = { { 5, 2, 1, 3 },{3,4}, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };

		for (int[] mySimpleArray : myComplexArray) {

			//for (int i = 0; i < mySimpleArray.length; i++) {
			for (int i:mySimpleArray) {
				
				System.out.print(i + "\t");

			}
			System.out.println();

		}
	}

}
