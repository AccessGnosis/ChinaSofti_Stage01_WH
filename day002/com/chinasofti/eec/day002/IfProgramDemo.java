package com.chinasofti.eec.day002;

import java.util.Scanner;

public class IfProgramDemo {

	public static void main(String[] args) {
		// if:若条件满足，则执行{}
		// 若条件不满足，不执行{}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数字：");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "是偶数");
		}
		System.out.println("over"); // 要跟if-else区分开，此语句必执行

		// if() {
		// 语句块1
		// }
		// else {
		// 语句块2
		// }
		System.out.println("请输入数字：");
		int num1 = scan.nextInt();
		if (num1 % 2 == 0) {
			System.out.println(num1 + "是偶数");
		} else {
			System.out.println(num1 + "是奇数");
		}
		System.out.println("over");
	}

}
