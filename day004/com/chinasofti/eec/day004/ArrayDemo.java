package com.chinasofti.eec.day004;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// 1.数组的定义
		// 声明一个整形数组arr，包含5个元素
		int[] arr = new int[5];

		System.out.println(arr[0]); // 输出arr数组中的第一个元素
		System.out.println(arr[1]); // 输出arr数组中的第二个元素

		int[] arr1; // 声明一个整形数组arr1
		int a; // 声明一个整形变量啊
		// System.out.println(a); //编译错误，没有初始化
		// System.out.println(arr1[0]); //编译错误，没有初始化(没有new来进行内存分配)

		// 2.数组的初始化
		int[] arr2 = new int[5]; // 第一种，初始化arr2数组，开辟5个整形元素的内存空间大小
		double[] arr3 = new double[5]; // 初始化arr3数组，开辟5个浮点型元素的内存空间大小
		int[] arr4 = { 1, 2, 3 }; // 第二种，初始化arr4数组，存储3个整形元素分别为1，2，3
		int[] arr5;
		// int[] arr6;
		// arr6 = {1, 2, 3}; //错误，不能在定义数组之后再初始化
		int[] arr7;
		arr7 = new int[] { 1, 2, 3 }; // 正确，在定义数组之后可以使用new关键字来初始化数组
		int[] arr8 = new int[] { 1, 2, 3, 4, 5 }; // 第三种，初始化arr8数组，存储5个元素
		// int[] arr9 = new int[5] { 1, 2, 3, 4 }; //错误，不能定义和分配空间后初始化数组

		// 3.数组的访问
		int[] arr10 = new int[] { 1, 5, 7, 9 };
		// 声明一个整形数组arr10，初始化长度为4，元素分别为1, 5, 7, 9
		System.out.println("arr10数组的长度是：" + arr10.length);
		arr10[0] = 2;
		arr10[1] = 6;
		arr10[2] = 10;
		// arr10[4] = 12; // 数组越界
		showArray(arr10);

		Arrays.sort(arr10);
		showArray(arr10);

		// scanfArray(传送数组名, 是否随机赋值(true/false))
		scanfArray(arr10, true);
		System.out.println("输出数组的随机数是：");
		showArray(arr10);

		// scanfArray(arr10);
		// showArray(arr10);

		System.out.println("逆序输出数组：");
		showReverseArray(arr10);

		System.out.println();
		System.out.println("数组中最大的数是：" + showArrayMaxEle(arr10));

		System.out.println("拷贝数组到arr11");
		int[] arr11 = arrayCopy(arr10);
		showArray(arr11);
	}

	// 输出数组元素
	public static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// 输出倒置数组元素
	public static void showReverseArray(int[] arr) {
		for (int i = (arr.length - 1); i >= 0; --i) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void scanfArray(int[] arr) {
		System.out.println("请输入数组元素");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = scan.nextInt();
		}
	}

	// 第二个参数为true时，随机生成数组元素
	// 第二个参数为false时，输入数组元素
	public static void scanfArray(int[] arr, boolean a) {
		if (a == true) {
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = (int) (Math.random() * 100);
			}
		} else {
			scanfArray(arr);
		}
	}

	// 返回数组最大值
	public static int showArrayMaxEle(int[] arr) {
		int max = arr[0]; // 假设第一个元素最大
		for (int i = 1; i < arr.length; ++i) { // 遍历剩余的元素
			if (arr[i] > max) { // 若剩余的元素大于max
				max = arr[i]; // 改变max的至为较大的值
			}
		}
		return max;
	}

	// 数组拷贝
	public static int[] arrayCopy(int[] arr) {
		int[] b = new int[arr.length];
		for (int i = 0; i < b.length; ++i) {
			b[i] = arr[i];
		}
		return b;
	}
}
