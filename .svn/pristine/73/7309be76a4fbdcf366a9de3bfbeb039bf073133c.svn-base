/**
* Describe: 常量
* Keyword: 
* Hint: 
* Filename: StaticFinalConst.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 下午4:27:11
*/
package com.chinasofti.eec.day010;

public class StaticFinalConst {

	public static void main(String[] args) {
		System.out.println(Roo.NUM); // 类名直接调用常量
		// Roo.PI在编译时被替换成3.1415926
		// Roo.NUM = 10;//编译错误，NUM不能被改变

		System.out.println(Soo.NUM);
		/*
		 * 1.加载Soo.class到方法区
		 * 2.将NUM存放在方法区中
		 * 3.去方法区中获取NUM的值并输出
		 */
		System.out.println(Soo.NUM2);
		// 在编译时直接替换成具体的数字
		// 相当于输出：System.out.println(6);
	}

}

class Roo {
	public static final int NUM = 100;
	// public static final double PI;// 编译错误，必须声明的同时初始化
}

class Soo {
	public static int NUM = 5;// 静态变量，非常量
	public static final int NUM2 = 6;// 这是一个常量
}