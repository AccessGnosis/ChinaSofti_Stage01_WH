package com.chinasofti.eec.day004.homework;

import java.util.Scanner;

public class Di_1 {

	public static void main(String[] args) {
		System.out.print("请输入查找指数的范围：2 ~ ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		for (int i = 2; i <= num; ++i) {
			if (primerNum(i) != -1) {
				System.out.print(i + "\t");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("质数有：" + count + "个");
	}

	public static int primerNum(int num) {
		for (int i = 2; i < num; ++i) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}

}
