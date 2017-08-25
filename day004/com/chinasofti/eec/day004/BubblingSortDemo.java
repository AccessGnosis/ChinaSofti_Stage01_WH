package com.chinasofti.eec.day004;

public class BubblingSortDemo {

	public static void main(String[] args) {
		// int[] arr = {56, 21, 34, 6};
		// 从小往大排列（升序）
		// 第一轮：i=0
		// 56和21比： 换 21 56 34 6
		// 56和34比： 换 21 34 56 6
		// 56和6比： 换 21 34 6 56 —— 冒出了56
		// 第二轮：i=1
		// 21和34比： 不换 21 34 6 56
		// 34和6比： 换 21 6 34 56 —— 冒出了34
		// 第三轮：i=2
		// 21和6比： 换 6 21 34 56 —— 冒出了21

		// 4个元素 比了3轮 arr.length-1

		// i = 0 比3次
		// i = 1 比2次
		// i = 2 比1次

		// 比的次数：arr.length - 1 - i

		int arr[] = new int[10];
		int i, j;

		for (i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 1000);
		}
		for (i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

		for (i = 0; i < arr.length - 1; ++i) {
			for (j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

}
