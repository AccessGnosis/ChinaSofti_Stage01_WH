package com.chinasofti.eec.task;

import java.util.Scanner;

//接受用户输入的一个年龄，判断是否在18到50之间
public class JudgeAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("请输入您的年龄：");
			int age = scan.nextInt();

			if (age >= 18 && age <= 50) {
				System.out.println("您的年龄在18到50岁之间");
			} else {
				System.out.println("您的年龄不在18到50岁之间");
			}

			System.out.print("还要继续判断么？(y/n)");
			if (scan.next().equals("n")) {
				break;
			}
		}
	}
}
