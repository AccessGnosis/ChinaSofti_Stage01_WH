/**
* Describe: 子类重写方法中super关键字的调用
* Keyword: 子类方法；重写
* Hint: 创建类型为父类为Foo的Goo向上造型obj对象，
* 		调用obj.f();时调用子类中的f()方法，
* 		子类中的f()方法通过super调用父类的f()方法
* Filename: OverrideDemo02.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 上午9:55:51
*/
package com.chinasofti.eec.day010;

public class OverrideDemo02 {

	public static void main(String[] args) {
		Foo obj = new Goo();
		obj.f();
	}

}

class Foo {
	void f() {
		System.out.println("Foo.f()");
	}
}

class Goo extends Foo {
	void f() {
		super.f();
		System.out.println("Goo.f()");
	}
}