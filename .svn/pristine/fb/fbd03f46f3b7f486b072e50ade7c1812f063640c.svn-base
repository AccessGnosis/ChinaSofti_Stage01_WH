package com.chinasofti.eec.day003;

public class ScopeDemo {
	// c所有类都能使用，但是得是静态变量
	static int c = 3;

	public static void main(String[] args) {
		// 变量的作用域范围
		// 从变量的声明开始，到包含它最近的大括号结束
		// 变量的同名问题：
		// 当变量作用域重叠时，变量不能同名
		int a = 5;
		int c = 10; // 和静态变量不同，可以起同名
		if (a > 2) {
			int b = 6;
			// int a = 4; //编译错误，范围（作用域）重叠时，变量不能同名
			System.out.println("a大于2");
			System.out.println(b);
		} else {
			int b = 9; // 可以继续定义b，上个b的作用域在if中
			System.out.println("a不大于" + a);
			// System.out.println(b); //报错，b是局部变量，此处无法使用
		}
		System.out.println(ScopeDemo.c);
		System.out.println(c);
		syso();
	}

	private static void syso() {
		System.out.println(c);
		// System.out.println(a); // a超出作用于范围，不能使用
	}

}
