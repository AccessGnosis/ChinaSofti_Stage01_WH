package com.chinasofti.eec.task;

import java.util.Random;
import java.util.Scanner;

public class LoopGuessGame_by_do_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请您输入一个数(输入0退出)");
		int num = (int) (Math.random() * 10 + 1);
		System.out.println("这个数字是：" + num);
		int cusNum = scan.nextInt();

		do {
			if (cusNum == 0) {
				System.exit(-1);
			}
			if (cusNum > num) {
				System.out.print("您猜的数大了，");
			} else {
				System.out.print("您猜的数小了，");
			}
			System.out.println("请重新猜(输入0退出)");
			cusNum = scan.nextInt();
		} while (cusNum != num); // 判断条件，条件为真进入循环

		System.out.println("恭喜，您猜对了");
	}

}
