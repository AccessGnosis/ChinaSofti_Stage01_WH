package com.chinasofti.eec.exam.onboard;

import java.util.Arrays;

//写一个排序算法，将10个1-100间的随机数进行排序？
public class Di_04 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println("排序前的随机数");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - i - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("排序后的随机数");
		System.out.println(Arrays.toString(arr));
	}
}
