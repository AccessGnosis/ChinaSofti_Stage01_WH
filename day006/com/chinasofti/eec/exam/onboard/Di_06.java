package com.chinasofti.eec.exam.onboard;

public class Di_06 {

	public static void main(String[] args) {
		int day = watermellon(1020);
		System.out.println(day);
	}

	public static int watermellon(int num) {
		if (num == 1 || num == 0) {
			return 1;
		} else {
			return (watermellon(num / 2 - 2));
		}
	}
}
