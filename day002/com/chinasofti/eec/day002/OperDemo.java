package com.chinasofti.eec.day002;

import java.util.Scanner;

public class OperDemo {

	public static void main(String[] args) {
		// 赋值运算 =
		// 扩展运算 += -= *= /= %=
		int a = 5;
		a += 5; // 相当于：a = a + 5 = 10
		System.out.println(a);
		a += 10; // 相当于：a = a + 10 = 20
		System.out.println(a);
		a++; // 相当于：a = a + 1 = 21
		++a; // 相当于：a = a + 1 = 22
		a *= 5; // 相当于：a = a * 5 = 110
		System.out.println(a);
		a %= 3; // 相当于：a = a % 3 = 2
		System.out.println(a);

		// "+"：如果两边都是数字，做加法运算
		// 若有一边为字符串，做字符串连接运算
		String str = "a = " + a;
		System.out.println(str);
		System.out.println("我的年龄是" + a + "岁"); // 字符串连接运算
		System.out.println(a + a); // 加法运算
		System.out.println(a + a + "岁"); // 字符串连接运算

		// 三目运算符
		int a1 = 50, b1 = 40;
		int max = (a1 > b1) ? a1 : b1;
		System.out.println("max is : " + max);

		// 三目运算符案例 判断闰年
		// Scanner scan = new Scanner(System.in);
		// System.out.print("请输入年份：");
		// int year = scan.nextInt();
		// boolean yearJudge = (year % 4 == 0 && year % 100 != 0 || year % 400
		// == 0);
		// System.out.println(yearJudge ? "是闰年" : "不是闰年");
		int a2 = 0;
		a2 = a2++;
		System.out.println(a2);
		// 0
	}

}
