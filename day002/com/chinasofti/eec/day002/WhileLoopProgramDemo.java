package com.chinasofti.eec.day002;

public class WhileLoopProgramDemo {

	public static void main(String[] args) {
		// 循环三要素：
		// 1.循环变量的初始化；
		// 2.循环条件（以循环变量为基础的）
		// 3.循环变量的改变（向着循环结束）
		int age = 1; // 1.循环变量的初始化
		while (age <= 10) { // 2.循环条件
			System.out.println("马上有钱");
			age++; // 3.循环变量的改变（向着循环结束）
		}
		System.out.println("program over");

		// 输出10次：行动是成功的阶梯
		int i = 0; // 1.循环变量的初始化；
		while (i < 10) { // 2.循环条件（以循环变量为基础的）
			System.out.println("第"+(i+1)+"次输出："+"行动是成功的阶梯");
			i++; // 3.循环变量的改变（向着循环结束）
		}
		System.out.println("program over");
	}

}
