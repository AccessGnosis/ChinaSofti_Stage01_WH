/**
* Describe: 1、	编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和。（循环）
* Keyword: 
* Hint: 
* Filename: Di_02_ClacProblem.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午2:11:34
*/
package com.chinasofti.eec.lft.task;

public class Di_02_ClacProblem {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; ++i) {
			int result = 1;
			for (int j = 2; j <= i; ++j) {
				result = result * j;
			}
			sum += result;
		}

		System.out.println("1！+2！+3！+……+10！的和是：" + sum);
	}
}
