package com.chinasofti.eec.day002.homework;

import java.util.Scanner;

public class Di_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入三个值：");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = -2147483648;

		if (a >= b && a >= c && b >= c) {
			max = a;
		} else if (a >= b && a >= c && b <= c) { // a>c>b
			max = a;
		} else if (a >= b && a <= c && b >= c) { // c>a>b
		} else if (a >= b && a <= c && b <= c) { // c>a>b
			max = c;
		} else if (a <= b && a >= c && b >= c) { // b>a>c
			max = b;
		} else if (a <= b && a >= c && b <= c) { // b>a>c
		} else if (a <= b && a <= c && b >= c) { // b>c>a
			max = b;
		} else if (a <= b && a <= c && b <= c) { // c>b>a
			max = c;
		}
		System.out.println("最大值是：" + max);
	}

}
