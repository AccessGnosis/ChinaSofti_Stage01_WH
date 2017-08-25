package com.chinasofti.eec.exam;

import java.util.Arrays;

public class Di_06 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 5, 2, 4, 1 };
		for (int i = 0; i < arr.length - 1; i++) {
			boolean isSwap = false;

			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					isSwap = true;
				}
			}

			if (!isSwap)
				break;
		}
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

}
