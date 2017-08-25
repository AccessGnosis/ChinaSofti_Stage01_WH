package com.chinasofti.eec.task;

import java.util.Scanner;

public class LoopGuessGame_v2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random() * 1000);
		System.out.println(num);
		System.out.println("请您输入一个1--1000之间的数");
		int guess = scan.nextInt(); // 循环变量
		while (num != guess) { // 循环条件
			if (guess == 0) {
				System.out.println("已退出");
				System.exit(-1);
			} else if (guess > num) {
				System.out.println("你猜的太大了！");
			} else {
				System.out.println("你猜的太小了！");
			}
			System.out.println("请您输入一个1--1000之间的数");
			guess = scan.nextInt(); // 循环变量的改变
		}
		if (num == guess) {
			System.out.println("恭喜您，猜对了！");
		} else {
			System.out.println("很抱歉，猜错了！");
		}
	}
}
