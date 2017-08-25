package com.chinasofti.eec.task;

import java.util.Scanner;

public class PlusGameDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("游戏开始");
		System.out.println();

		int i;
		int score = 0;
		for (i = 0; i < 10; ++i) {
			System.out.println("请在等号后输入结果（输入-1退出游戏）");
			// 生成两个随机整数
			int a = (int) (Math.random() * 10 + 1);
			int b = (int) (Math.random() * 10 + 1);
			System.out.print(a + " + " + b + " = ");
			int result = a + b;
			int cusResult = scan.nextInt();

			if (result == cusResult) {
				score += 10;
				System.out.println("答对了");
			} else {
				System.out.println("答错了");
			}

			if (i == 9) {
				System.out.println();
				System.out.println("对了：" + (score / 10) + "  错了：" + (10 - score / 10) + " 获得" + score + "分");
			}

			// 用户输入-1退出
			if (cusResult == -1) {
				break;
			}
		}
	}

}
