package com.chinasofti.eec.day004.homework;

import java.util.Scanner;

public class Di_1_v2 {

	public static void main(String[] args) {
		System.out.print("请输入查找指数的范围：2 ~ ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;

		int i, j;
		for (j = 2; j < num; ++j) {
			for (i = 2; i < num; ++i) {
				if (j % i == 0) {
					break;
				}
			}
			if (i == j) {
				count++;
				System.out.print(j + "\t");
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("质数有：" + count + "个");
	}
}
