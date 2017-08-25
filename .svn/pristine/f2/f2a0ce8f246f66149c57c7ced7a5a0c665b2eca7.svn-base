package com.chinasofti.eec.task;

import java.math.BigDecimal;

/*
 * 1.声明double型的变量a，存储值为25.50
 * 2.声明float型变量b，存储值为25.50
 * 3.声明double型变量c，存储5/2
 * 4.声明double型变量d，存储5.0/2
 * 5.声明double型变量e，存储3.0
 * 6.声明double型变量f，存储2.81
 * 7.输出e-f
 * 8.声明char类型c1，存储‘王’
 * 9.声明char类型，存储一个空格
 * 10.声明char类型，存储一个单引号
 * 11.输出boolean类型变量d1，存储true
 * 12.声明boolean类型变量d2，存储‘你’
 * 13.声明一个char类型，输出 ‘2’
 * 14.声明一个char类型，输出 ‘2’+‘2’
*/
public class ElementTypeTask {

	public static void main(String[] args) {
		double a = 25.50;
		float b = 25.50F;
		double c = 5 / 2; // 结果是2.0，因为5和2都是int类型
		double d = 5.0 / 2;
		double e = 3.0;
		double f = 2.81;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);

		// BigDecimal解决浮点数减、除不精确的问题
		BigDecimal be = new BigDecimal(Double.toString(e)); // 将浮点数传入BigDecimal类中
		BigDecimal bf = new BigDecimal(Double.toString(f)); // 必须以字符串形式传入
		double bef = be.subtract(bf).doubleValue(); // e的值减去f的值，经过精确计算后赋值给bef
		// 运算方法
		// 加法 add()
		// 减法 subtract()
		// 乘法 multiply()
		// 除法 divide()
		// 运算完成后使用floatValue()、doubleValue()等方法将精确计算结果赋值使用
		System.out.println("e-f = " + bef);

		BigDecimal bresult = new BigDecimal(0);
		bresult = calcSubtractBigNumber(Double.toString(e), Double.toString(f));
		System.out.println("e-f = " + bresult.doubleValue());

		char c1 = '王';
		char c2 = ' ';
		char c3 = '\'';

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		boolean d1 = true;
		// boolean d2 = '你';
		char d2 = '你';

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);

		char d3 = '2';	//d3是个字符，2的ASCII码值是50
		char d4 = '2' + '2';	//两个字符相加，实际上是ASCII码值的相加
		System.out.println(d3);	//单个字符操作的时候不转换
		System.out.println(d3 + d3);
		System.out.println(d4);
		
		double pi = Math.PI;
		System.out.println(pi);
		System.out.println((float)pi);	//精度丧失
	}

	public static BigDecimal calcSubtractBigNumber(String a, String b) {
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bb = new BigDecimal(b);

		return ba.subtract(bb);
	}
}
