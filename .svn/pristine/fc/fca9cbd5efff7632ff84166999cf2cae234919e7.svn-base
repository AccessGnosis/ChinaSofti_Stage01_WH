package com.chinasofti.eec.exam.onboard;

import java.util.Scanner;

//编写一个程序，提示让用户输入2个整数，
//然后计算这2个整数之间能被5整除的所有整数的和，并打印显示
public class Di_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入起始数字");
		int a = scan.nextInt();
		System.out.print("请输入上限数字");
		int b = scan.nextInt();
		int sum = 0;
		if (a <= b) {
			for (int i = a + 1; i < b; ++i) {
				if (i % 5 == 0) {
					sum += i;
				}
			}
			System.out.println("数字区间（包括上下限数字）内所有能被5整除的数的和是：" + sum);
		} else {
			System.out.println("您输入的数据有问题");
		}
	}
}
