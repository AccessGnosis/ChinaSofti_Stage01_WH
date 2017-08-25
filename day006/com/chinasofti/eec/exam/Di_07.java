package com.chinasofti.eec.exam;

public class Di_07 {

	public static void main(String[] args) {
		for (int i = 1, count = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				if (++count >= 10) {
					break;
				}
			}
		}
	}

}
