package com.chinasofti.eec.day002.homework;

import java.util.Scanner;

public class Di_7_by_switch_case {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = scan.nextInt();
		System.out.print("请输入月份：");
		int month = scan.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("您输入的月份有误");
		}

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year + "年" + month + "月有31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year + "年" + month + "月有30天");
			break;
		default:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				if (month == 2) {
					System.out.println(year + "年" + month + "月有29天");
				}
			} else {
				if (month == 2) {
					System.out.println(year + "年" + month + "月有28天");
				}
			}
			break;
		}
	}
}