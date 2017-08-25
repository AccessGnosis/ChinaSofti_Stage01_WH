package com.chinasofti.eec.day004.homework;

import java.util.Scanner;

public class Di_1_v3 {
	public static void main(String[] args) {
		// 质数：只能被1和它本身整除的数

		// 想判断一个数是不是质数
		// 5：5%2/3/4 都不是0 是质数
		// 6：6%2 有0 不是质数
		// 7：7%2/3/4/5/6 都不是0 是质数
		// 总结：
		// 只要有一个取余为0就不是质数
		// 当取余所有的都不为0，则是质数
		// 判断一个数是否是质数
		// 开关：一次比较不能得到最终结果的情况下
		// int num = 97; // 2, 3, 4, 5, 6
		Scanner scan = new Scanner(System.in);
		System.out.print("输出质数：请输入从2~");
		int scanf = scan.nextInt();
		int count = 0; // 计数器
		// for (int i = 2; i < num; ++i) { //所有数
		// for (int i = 2; i < num / 2; ++i) { //半数
		for (int num = 2; num < scanf; ++num) { // 遍历2~scanf间的每个数
			boolean flag = true;// 1、声明开关并初始化。假设是质数
			for (int i = 2; i <= Math.sqrt(num); ++i) { // 开方数
				if (num % i == 0) { // 判断是否取余为0
					flag = false; // 2、不是质数
					break;
				}
			}
			if (flag) { // 3、判断
				count++; // 计数器++
				System.out.print(num + "\t");
				if (count % 10 == 0) { // 判断计数器，10个一换行
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("一共有" + count + "个质数");
	}
}
