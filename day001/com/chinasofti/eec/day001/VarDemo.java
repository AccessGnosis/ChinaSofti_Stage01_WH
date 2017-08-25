package com.chinasofti.eec.day001;

public class VarDemo {

	// 单行注释

	/*
	 * 多行注释
	 */

	/**
	 * 文档注释
	 */

	public static void main(String[] args) {
		// 变量的声明
		int a; // 声明一个整形的变量，名称为a
		int c, d, e; // 声明三个整形的变量，名称分别为c, d, e

		// 赋值
		a = 10; // 给a开始赋值，赋值value为10

		// 变量声明并赋初值
		int b = 20; // 给b声明int类型，并赋初值20

		System.out.println(a);
		System.out.println(b);
		// System.out.println(c); //报错，因为变量c没有初始化

		// int 123go = 100; //数字不能做变量名的开头
		int 成绩 = 60; // 变量名可以为中文，但是不推荐
		System.out.println(成绩);
		// int break = 200; //关键字，java保留字不可以用为变量名
		int score = 80;
		// System.out.println(Score); //在java中大小写是敏感的
		// int a*b; int a+b; //变量名中不能加运算符
		int a_b; // 变量名中可以包含下划线
		int _a; // 下划线可以在变量名的任意位置出现
		int score01, javaScore, myJavaScore; // 建议变量名要符合驼峰命名法
		int age; // 见名知意
	}

}
