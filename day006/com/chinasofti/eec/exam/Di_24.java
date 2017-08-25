package com.chinasofti.eec.exam;

public class Di_24 {

	public static void main(String[] args) {
		System.out.println(getValue(2));
		System.out.println("5" + 2);

		int i = 1;
		int j;
		j = i++;

		System.out.println(i + " " + j);
	}

	public static int getValue(int i) {
		int result = 0;
		switch (i) {
		case 1:
			result = result + i;
		case 2:
			result = result + i * 2;
		case 3:
			result = result + i * 3;
		}
		return result;
	}

}
