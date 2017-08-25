package com.chinasofti.eec.task;

import java.util.Scanner;

public class LoopGuessGame_by_do_while_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random() * 1000) + 1;
		System.out.println("隐藏的数是：" + num);
		int guess;

		do {
			System.out.println("猜吧！");
			guess = scan.nextInt();
			if (guess == 0) {
				break;
			} else if (guess > num) {
				System.out.println("你猜的太大了");
			} else if (guess < num) {
				System.out.println("你猜的太小了");
			}
		} while (guess != num);
		if (guess == num) {
			System.out.println("恭喜您猜对了");
		} else {
			System.out.println("欢迎您下次再来");
		}
	}

}
