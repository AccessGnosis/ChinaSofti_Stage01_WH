package com.chinasofti.eec.task;

import java.util.Arrays;

public class ArraysCopyOfDemo {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 1000);
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = max;

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
