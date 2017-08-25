package com.chinasofti.eec.day005.homework;

import java.util.Scanner;

public class Di_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入希望生成的随机数组长度：");
		int length = scan.nextInt();
		System.out.print("请输入希望生成随机数组的上限：");
		int untilNum = scan.nextInt();

		int[] arr = generateArray(length, untilNum);

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

	public static int[] generateArray(int length, int untilNum) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * untilNum);
		}
		return arr;
	}
}
