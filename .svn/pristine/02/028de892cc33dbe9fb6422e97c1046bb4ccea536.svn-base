package com.chinasofti.eec.day004.homework;

public class Di_4 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 100);
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int[] afArr = new int[arr.length + 1];
		System.arraycopy(arr, 0, afArr, 1, arr.length);
		afArr[0] = min;

		for (int i = 0; i < afArr.length; ++i) {
			System.out.print(afArr[i] + " ");
		}
	}

}
