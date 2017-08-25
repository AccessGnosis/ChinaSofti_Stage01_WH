/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InterfaceDemo02.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午1:39:36
*/
package com.chinasofti.eec.day011;

public class InterfaceDemo02 {

	public static void main(String[] args) {

	}

}

interface Aoo {
	public static final int NUM = 100;
	double PI = 3.14159; // 自动补全 public static final
	// int NUM2;//编译错误，必须赋初值

	public abstract void show();

	void say(); // 自动补全 public abstract

	// void say1(){} // 报错，不实现方法
}

interface Doo {
	void c();
}

interface Boo {
	void a();

	void b();
}

interface Eoo extends Doo {

}

interface Foo extends Doo, Boo {

}

abstract class Hoo {
	int i;

	public abstract void say2(); // 抽象类中的abstract关键字不能省略
}

class Ioo extends Hoo implements Doo, Boo {

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

	@Override
	public void say2() {
	}

}

class Coo implements Doo {

	@Override
	public void c() {
	}

}