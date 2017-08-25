/**
* Describe: 关键字 static
* Keyword: 静态变量；静态方法；静态块
* Hint: 
* Filename: StaticDemo.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 下午1:54:49
*/
package com.chinasofti.eec.day010;

public class StaticDemo {

	public static void main(String[] args) {
		Joo j1 = new Joo();
		Joo j2 = new Joo();
		System.out.println(j1.b); // 可以使用实例化对象调用静态变量
		System.out.println(Joo.b); // 一般使用类名调用
		j1.say();
		Joo j3 = new Joo();
		j3.say();

		Koo ko = new Koo();
		ko.a = 1;
		ko.b = 2;// 不建议
		Koo.b = 2;
		ko.test();// 不建议，静态方法通过类名调用
		Koo.test();

		Loo lo = new Loo();
		Loo lo1 = new Loo();// 静态块在类中只被加载一次
		// lo1中不会再加载静态块
	}

}

class Joo {
	int a;// 实例变量：属于对象的，存在于堆中 //对象调用
	static int b;// 静态变量：属于类的，存在于方法区中 //类名调用

	public Joo() {
		a++;
		b++;
	}

	void say() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

class Koo {// 验证静态方法
	int a;
	static int b;

	static {
		// 类加载期间，只执行一次
		System.out.println("Load Foo.class");
	}

	void show() {// 含有隐式的this传递
		this.a = 1;
		this.b = 2; // 报警告
	}

	static void test() {// 没有隐式的this传递
		// a = 1; //编译错误，不能访问实例变量
		// this.a = 1;//错误
		b++;// 静态方法可以访问静态变量
		System.out.println("static test()");
	}
}

class Loo {
	public Loo() {
		System.out.println("Loo的无参构造方法被调用了");
	}

	static {
		System.out.println("Loo的静态块被加载了");
	}
}