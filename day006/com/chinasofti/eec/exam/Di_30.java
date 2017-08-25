package com.chinasofti.eec.exam;

public class Di_30 {

	public static void main(String[] args) {
		int[] arr = { 15, 67, 26, 43, 61, 25, 84, 80, 34, 70 };

		int i, j;
		for (i = 0; i < arr.length - 1; ++i) {
			for (j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
