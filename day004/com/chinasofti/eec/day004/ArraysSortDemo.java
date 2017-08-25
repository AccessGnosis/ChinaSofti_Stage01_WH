package com.chinasofti.eec.day004;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

}
