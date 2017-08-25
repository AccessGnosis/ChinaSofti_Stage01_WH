package com.chinasofti.eec.day003;

public class ForDemo {

	public static void main(String[] args) {
		// for(表达式1; 表达式2; 表达式3){
		// 语句块(循环体);
		// }
		int i;
		for (i = 0; i < 10; ++i) {
			System.out.println("第" + (i + 1) + "次输出行动是成功的阶梯");
		}

		// 累加：1+2+3+……+100 = 5050
		int sum = 0;
		for (i = 0; i < 100; ++i) {
			sum += (i + 1);
		}
		System.out.println("1+2+3+……+" + i + "的值是：" + sum);

		int multiply = 1;
		for (i = 0; i < 10; ++i) {
			multiply *= (i + 1);
		}
		System.out.println("1*2*3*……*" + i + "的值是：" + multiply);

		// for的特殊用法1（省略循环变量初始值）
		sum = 0;
		i = 0;
		for (; i < 100; ++i) {
			sum += (i + 1);
		}
		System.out.println("1+2+3+……+" + i + "的值是：" + sum);

		// for的特殊用法2（省略循环变量变化）
		sum = 0;
		i = 0;
		for (; i < 100;) {
			sum += (i + 1);
			++i;
		}
		System.out.println("1+2+3+……+" + i + "的值是：" + sum);
		// 循环条件不能省略，循环体和循环变化可以省略

		int j;
		for (i = 1, j = 6; i <= 6; i += 2, j -= 2) {
			System.out.println("i,j = " + i + "," + j);
		}
		// for语句中的三个表达式中表达式1和表达式3可以使用逗号表达式，
		// 逗号表达式就是通过","运算符隔开的多个表达式组成的表达式，从左向右计算
	}
}
