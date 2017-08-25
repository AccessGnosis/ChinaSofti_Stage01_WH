package com.chinasofti.eec.task;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class SeriesDemo {

	public static void main(String[] args) {
		// 计算 9+99+……+9999999999=
		long sum = 0;
		long b = 0;

		// 9 = 9 * 10^0 +
		// 99 = 9 * 10^1 + 9
		// 999 = 9 * 10^2 + 99
		// 次方公式解决
		for (int i = 0; i < 10; ++i) {
			b += (long) (9 * Math.pow(10, i));
			sum += b;
		}
		System.out.println(sum);

		sum = 0;
		b = 0;
		// 利用上一个数的结果解决
		for (int i = 0; i < 10; ++i) {
			b = b * 10 + 9;
			sum += b;
		}
		System.out.println(sum);

		sum = 0;
		// 递归方式解决
		for (int i = 1; i <= 10; ++i) {
			sum += calc(i);
		}
		System.out.println(sum);

		// 求和：1/1+1/2+1/3+……+1/n = ?
		double sumNumber = 0;
		System.out.print("请输入分母累加终点数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 1; i <= num; ++i) {
			sumNumber += (1.0 / i);
		}
		System.out.println("1/1+1/2+1/3+……+1/n = " + sumNumber);
	}

	public static long calc(int i) {
		if (i == 1) {
			return 9;
		} else {
			return calc(i - 1) * 10 + 9;
		}
	}

}
