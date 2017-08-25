package com.chinasofti.eec.exam.onboard;

import java.util.Arrays;

public class Di_04_v3 {
	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println(Arrays.toString(num));
		sortDemo(num);
		System.out.println(Arrays.toString(num));
	}

	public static void sortDemo(int[] number) {
		for (int i = 0; i < number.length - 1; ++i) { // 比的轮数
			int m = i;
			for (int j = i + 1; j < number.length; ++j) {
				if (number[j] < number[m]) { // 如果前面的数大于后面的数，换下标
					m = j;
				}
			}
			if (i != m) {
				swap(number, i, m);
			}
		}
	}

	public static void swap(int[] number, int i, int j) {
		int t;
		t = number[i];
		number[i] = number[j];
		number[j] = t;
	}
}
