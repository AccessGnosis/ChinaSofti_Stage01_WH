/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FinalDemo.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 下午4:03:53
*/
package com.chinasofti.eec.day010;

public class FinalDemo {

	public static void main(String[] args) {
	}

}

class Moo { // 演示final修饰变量
	final int a = 300;// 声明的同时初始化
	final int b;// 先声明变量b

	Moo() {
		this.b = 400;// 在构造函数中初始化
	}

	void show() {
		final int c; // final修饰局部变量，使用之前需要初始化
		// a = 100;// 编译错误，final修饰的变量不可被改变
	}
}

class Noo {// 演示final修饰方法
	void say() {
	}

	final void show() { // final修饰的方法时不能被重写的
	}
}

class Ooo extends Noo { // 演示final修饰方法
	@Override
	void say() {
	}
	// void show(){}//show方法是不能被重写的
}

final class Poo extends Noo {// 演示final修饰类
}// Poo被final修饰不能被继承，但是可以继承其他的类

// class Qoo extends Poo { //编译错误
// }// Qoo不能继承Poo