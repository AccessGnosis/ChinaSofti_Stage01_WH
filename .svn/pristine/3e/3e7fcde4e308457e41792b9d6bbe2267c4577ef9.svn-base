package com.chinasofti.eec.exam.onboard;

import java.util.Arrays;

public class Di_04_v2 {
	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println(Arrays.toString(num));

		sortDemo(num);
		System.out.println(Arrays.toString(num));
	}

	public static void sortDemo(int[] arr) {
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - i - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
