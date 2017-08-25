package com.chinasofti.eec.day002.homework;

import java.util.Scanner;

public class Di_4 {
	// 使用程序为用户所录入的 3 个数值进行升序排列，并将排序后的结果输出到控制台。
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三个数（用空号隔开）：");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = -2147483648, mid = -2147483648, min = -2147483648;

		System.out.println("您输入的三个数是 " + a + "  " + b + "  " + c);

		if (a >= b && a >= c && b >= c) {
			// 000
			max = a;
			mid = b;
			min = c;
		} else if (a >= b && a >= c && b <= c) { // a>c>b
			// 001
			max = a;
			mid = c;
			min = b;
		} else if (a >= b && a <= c && b >= c) { // c>a>b
		} else if (a >= b && a <= c && b <= c) { // c>a>b
			max = c;
			mid = a;
			min = b;
		} else if (a <= b && a >= c && b >= c) { // b>a>c
			max = b;
			mid = a;
			min = c;
		} else if (a <= b && a >= c && b <= c) { // b>a>c
		} else if (a <= b && a <= c && b >= c) { // b>c>a
			max = b;
			mid = c;
			min = a;
		} else if (a <= b && a <= c && b <= c) { // c>b>a
			max = c;
			mid = b;
			min = a;
		}

		System.out.println("升序后的三个数是 " + min + "  " + mid + "  " + max);
	}

}
