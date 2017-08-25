/**
* Describe: java中递归溢出情况
* Keyword: 
* Hint: 
* Filename: RecursionDemo.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 上午10:30:40
*/
package com.chinasofti.eec.day009;

public class StackProblem_RecursionDemo {

	static long count = 1;

	public static void main(String[] args) {
		// try {
		// f();
		// } finally {
		// System.out.println(count);
		// }
		// 栈溢出

		Function f = new Function();
		try {
			f.f();
		} finally {
			System.out.println(f.count);
		}
	}

	public static void f() {// 1
		System.out.print(count++);
		System.out.println("FFFF");// 2
		g();// 3
		System.out.println("1111");// 8
	}

	public static void g() {// 3
		System.out.print(count++);
		System.out.println("GGGG");// 4
		k();// 5
		System.out.println("2222");// 7
	}

	public static void k() {// 5
		System.out.print(count++);
		System.out.println("KKKK");// 6
		f();
	}

	public static int ff(int n) {
		++count;
		if (n == 1) {
			return 1;
		} else {
			return ff(n);
		}
	}

}

class Function {
	static int count = 1;

	public void f() {// 1
		System.out.print(count++);
		System.out.println("FFFF");// 2
		g();// 3
		System.out.println("1111");// 8
	}

	public void g() {// 3
		System.out.print(count++);
		System.out.println("GGGG");// 4
		k();// 5
		System.out.println("2222");// 7
	}

	public void k() {// 5
		System.out.print(count++);
		System.out.println("KKKK");// 6
		f();
	}

	public int ff(int n) {
		++count;
		if (n == 1) {
			return 1;
		} else {
			return ff(n);
		}
	}
}
