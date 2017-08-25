package com.chinasofti.eec.day005.homework;

import java.util.Random;
import java.util.Scanner;

public class Di_1_ArrayUtil {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int max = scan.nextInt();
		int[] arr = generateArray(length, max);
		System.out.print("生成的数组是：");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("生成的数组是：" + Arrays.toString(arr));
	}

	// 该方法实现的是生成指定元素长度的数组，并为该数组指定范围内的随机数
	public static int[] generateArray(int length, int max) {
		// 创建长度为length的数组
		int[] arr = new int[length]; // 默认值为0
		// 循环生成length个数值，并赋值给数组中的元素
		Random random = new Random(); // 创建random对象，目的生成随机数
		for (int i = 0; i < length; ++i) { // 遍历数组
			arr[i] = random.nextInt(max); // 给数组中的每个元素赋值，随机生成一个0--max间的整数
		}

		return arr;
	}
}

class Arrays {
	public static String toString(int[] arr) {
		String str = null;
		for (int i = 0; i < arr.length; ++i) {
			str += (arr[i] + " ");
		}
		return str;
	}
}