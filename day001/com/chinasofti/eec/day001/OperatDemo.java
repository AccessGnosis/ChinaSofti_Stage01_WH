package com.chinasofti.eec.day001;

public class OperatDemo {
	public static void main(String[] args) {
		// 算术运算 + - * / % ++ --
		// 取余数（%）
		int a = 255;
		System.out.println(a % 8); // 7
		System.out.println(5 % 2); // 1
		System.out.println(8 % 2); // 0
		System.out.println(8.8 % 2); // 0.8000000000000007
		System.out.println(2 % 8); // 2

		// ++自增1
		// --自减1

		// 1.单独使用时，++、--在前在后无差别
		// 2.若被使用时，++、--在前在后有差别
		// ① ++、--在前，先运算（自增，自减）再使用
		// ② ++、--在后，先使用后运算（自增，自减）

		int b = 3, c = 4, d = 5;
		b++; // 相当于b = b + 1，单独使用
		++c; // 相当于c = c + 1，单独使用
		System.out.println(b); // 4
		System.out.println(c); // 5
		System.out.println(d++); // 5 非单独使用，为被使用

		int e = 5, f = 6;
		System.out.println(e++); // 5
		System.out.println(e); // 6
		System.out.println(++f); // 7
		System.out.println(f); // 7

		int g = 7, h = 8;
		int i = g++;
		int m = ++h;
		System.out.println(g); // 8
		System.out.println(i); // 7
		System.out.println(h); // 9
		System.out.println(m); // 9

		// 关系运算符： > < >= <= == !=
		// 关系运算的结果是boolean类型（true或false）
		int a1 = 5, b1 = 8, c1 = 5;
		System.out.println(a1 > b1); // false
		boolean b4 = a1 != c1;
		System.out.println(b4); // false
		boolean b3 = a1 <= c1;
		System.out.println(b3); // true
		boolean b2 = a1 < c1;
		System.out.println(b2); // false

		// 逻辑运算符： && || ！
		// 逻辑运算的结果也是boolean类型（true或false）
		// &&：短路与，两边都为真，则为真。当左边为false时，发生短路（不再计算右边）
		// ||：短路或，有一边为真，则为真。当左边为true时，发生短路（不再计算右边）
		// !：非真即假，非假即真
		int aa = 100, bb = 200;
		boolean cc = aa < bb || aa++ > 1;
		System.out.println(aa); // 发生短路，aa的自增不执行
		System.out.println(cc); // true
		boolean dd = aa > bb && bb++ > 1;
		System.out.println(bb);
		System.out.println(dd); // false

		int xx = 5, yy = 8, zz = 5;
		System.out.println(!(xx > yy)); // true
		System.out.println(!(xx < yy)); // false
	}
}
