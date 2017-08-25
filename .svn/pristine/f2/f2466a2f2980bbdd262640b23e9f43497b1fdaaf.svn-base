package com.chinasofti.eec.exam.onboard;

import java.util.Scanner;

//有这样一类数字，它们顺着看和倒着看是相同的数，例如：121,656,2332等，
//这样的说着就称为回文数字，编写一个java程序，判断从键盘接收的说字是否为回文数字？
public class Di_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = scan.nextInt();
		int reverseNum = reverseNum(num);

		if (reverseNum == num) {
			System.out.println("这是一个回文数");
		} else {
			System.out.println("这不是一个回文数");
		}

	}

	public static int judgePlalindrome(int num) {
		int num_judge = 0;

		return num_judge;
	}

	public static int judgeNum(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	public static int reverseNum(int num) {
		int num_judge = 0;
		for (int i = 0; i < judgeNum(num); ++i) {
			int a = (int) (num % (Math.pow(10, (i + 1))) / (Math.pow(10, i)));
			num_judge += (int) (a * Math.pow(10, ((judgeNum(num) - (i + 1)))));
		}
		return num_judge;
	}
}
