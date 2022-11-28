package com.curso;

public class Lion {

	public void roar(String roar1, StringBuilder roar2) {

		roar1.concat("!!!");
		roar2.append("!!!");
		//System.out.println(roar1);

	}

	public static void main(String[] args) {

		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
		// System.out.println(roar1 + " " + roar2);
		/// roar //roar!!!

		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");

		// abbaccca
		// 012

		// System.out.println(sb);
		test4_6();

	}

	static void test4_6() {

		int count = 0;
		BUNNY: for (int row = 1; row <= 3; row++)
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0) {
					continue; //break;
				}
				
				count++;
			}
		System.out.println(count);

	}
}
