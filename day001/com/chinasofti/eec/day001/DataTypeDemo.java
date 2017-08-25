package com.chinasofti.eec.day001;

import java.math.BigDecimal;

public class DataTypeDemo {

	public static void main(String[] args) {
		// int 整形 4个字节—— -21亿——21亿
		int a = 5; // 声明一个整形变量a并赋初值为5，5就叫做直接量
		// int b = 10000000000; //超过int值的范围

		int b = a / 2; // 整数间相除结果还是整数，小数无条件舍弃
		System.out.println(b);

		int c = 1000000000;
		int d = 10;
		int e = c * d;
		System.out.println(e); // 结果1410065408

		int f = 2147483647;
		int f1 = f + 1;
		int f2 = f1 - 1;
		System.out.println(f1); // -2147483648 负的最小值
		System.out.println(f2); // 2147483647 整的最大值

		// long g = 10000000000; //字面值不加l或者L就会报错
		long g1 = 10000000000l;
		long g2 = 10000000000L;
		long g3 = 1000l * 100 * 30000 * 10; // 从前往后乘，所以l一般加第一个数后面
		long g4 = 1000 * 100 * (long) 30000 * 10;
		System.out.println(g3);
		System.out.println(g4);

		// 给time赋值为从1970年1月1日到现在的毫秒数
		long time = System.currentTimeMillis();
		System.out.println(time); // 1484278075225
		System.out.println(time / 1000 / 60 / 60 / 24);

		// double浮点数有8个字节
		double h = 3.2;
		double h1 = 1.9;
		double h2 = h + h1;
		double h3 = h - h1;
		System.out.println(h2); // 浮点型数据做加法和乘法没有误差
		System.out.println(h3); // 浮点型数据做减法或除法可能有舍入误差
		// BigDecimal类可以解决不精确浮点数的运算

		// char类型有2个字节
		char i = '中';
		char i1 = 'a';
		char i2 = 97; // 97在ASCII码中是a
		char i3 = 0x0041;
		char i4 = '\u0041';
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

		// boolean类型有1个字节
		boolean j = true;
		boolean j1 = false;
		boolean j2 = 3 > 2;
		// boolean j3 = 4; //报错，不能存储初true和false之外的数
	}

}
