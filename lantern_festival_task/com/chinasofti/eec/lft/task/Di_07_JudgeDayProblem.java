/**
* Describe: 题目：输入某年某月某日，判断这一天是这一年的第几天？
* Keyword: 
* Hint: 
* Filename: Di_07_JudgeDayProblem.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午3:25:32
*/
package com.chinasofti.eec.lft.task;

import java.util.Scanner;

public class Di_07_JudgeDayProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("请输入年份");
		int year = scan.nextInt();
		System.out.print("请输入月份");
		int month = scan.nextInt();
		System.out.print("请输入日期");
		int day = scan.nextInt();

		int dayInYear = 0;

		if (month == 1) {
			dayInYear = day;
		} else {
			for (int i = 1; i < month; ++i) {
				dayInYear += judgeMonthDays(year, i);
			}
			dayInYear += day;
		}
		System.out.println(year + "年" + month + "月" + day + "日是本年中的第" + dayInYear + "天");
	}

	public static boolean judgeLoopYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int judgeMonthDays(int year, int month) {
		if (month == 2) {
			if (judgeLoopYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

}
