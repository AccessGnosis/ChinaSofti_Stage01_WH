package com.chinasofti.eec.day004;

import java.util.Arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		// 原数组
		int[] arr = { 10, 20, 30, 40, 50 }; // 定义一个整形数组arr
		// 目标数组
		int[] arr1 = new int[6]; // 声明一个空间大小为6的整形数组arr1

		// 原数组：arr
		// 原数组的起始位置：0
		// 目标数组：arr1
		// 目标数组的起始位置：0
		// 要复制原数组的长度：4

		// 数组的复制
		System.arraycopy(arr, 0, arr1, 0, 4);
		// 遍历数组arr1
		for (int i = 0; i < arr1.length; ++i) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.arraycopy(arr, 1, arr1, 0, 4);
		for (int i = 0; i < arr1.length; ++i) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		// System.arraycopy(arr, 1, arr1, 1, 5); // 报错，数组超过界限

		int[] arr2 = Arrays.copyOf(arr, 8);
		for (int i = 0; i < arr2.length; ++i) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		arr2 = Arrays.copyOf(arr, 2);
		for (int i = 0; i < arr2.length; ++i) {
			System.out.print(arr2[i] + " ");
		}

		//数组的扩容，用Arrays.copyOf()实现
		arr = Arrays.copyOf(arr, arr.length+2);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

}
