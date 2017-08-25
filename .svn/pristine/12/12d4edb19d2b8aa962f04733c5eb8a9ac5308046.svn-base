/**
* Describe: 3、	依次输入10个学生成绩，判断学生（优秀、良好、中等、及格、不及格）并计算人数（switch）
* Keyword: 
* Hint: 
* Filename: Di_03_ClassifyStudentsScore.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午2:24:54
*/
package com.chinasofti.eec.lft.task;

import java.util.Scanner;

public class Di_03_ClassifyStudentsScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int outstanding, well, good, pass, flunk;
		outstanding = well = good = pass = flunk = 0;
		int[] score = new int[10];
		System.out.println("请输入10个学生的成绩：");
		for (int i = 1; i <= 10; ++i) {
			System.out.print("第" + i + "个学生的成绩是：");
			score[i - 1] = scan.nextInt();
			if (score[i - 1] > 100 || score[i - 1] < 0) {
				System.out.println("您输入的第" + i + "个学生的成绩有误,请重新输入本学生成绩");
				--i;
			}
		}

		for (int i = 1; i <= 10; ++i) {
			switch (score[i - 1] / 10) {
			case 10:
			case 9:
				outstanding++;
				break;
			case 8:
				well++;
				break;
			case 7:
				good++;
				break;
			case 6:
				pass++;
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				flunk++;
				break;
			default:
				break;
			}
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("-------------------最终结果--------------------");
		System.out.println("成绩优秀的学生有：" + outstanding);
		System.out.println("成绩良好的学生有：" + well);
		System.out.println("成绩中等的学生有：" + good);
		System.out.println("成绩及格的学生有：" + pass);
		System.out.println("成绩不及格的学生有：" + flunk);
	}

}
