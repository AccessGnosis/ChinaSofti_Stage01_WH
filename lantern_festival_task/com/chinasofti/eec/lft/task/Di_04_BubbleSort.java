/**
* Describe: 4、	使用冒泡排序（数组）
* Keyword: 
* Hint: 
* Filename: Di_04_BubbleSort.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午2:43:35
*/
package com.chinasofti.eec.lft.task;

import java.util.Scanner;

public class Di_04_BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("请输入5个数");
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("排序后的数组是：");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
