package com.chinasofti.eec.task;

import java.util.Scanner;

public class LoopGuessGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cusNum = 0;
		int randomNum = (int) (Math.random()*10);	//生成的数是浮点数，需要强制类型转换
		System.out.println("这个数是：" + randomNum);

		while (true) {
			System.out.print("请输入一个数(0~9)：");
			cusNum = scan.nextInt();
			if (randomNum == cusNum) {
				System.out.println("您猜对啦！");
				break;
			} else {
				System.out.print("请您继续猜！");
				if(cusNum > randomNum){
					System.out.println("您猜的数大了");
				}else{
					System.out.println("您猜的数小了");
				}
			}
		}
	}

}
