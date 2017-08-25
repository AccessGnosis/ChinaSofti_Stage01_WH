/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InterfaceDemo_Test.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 上午11:31:48
*/
package com.chinasofti.eec.day011;

public class InterfaceDemo_Test {

	public static void main(String[] args) {
		C c = new C();
		A a = c; // 向上造型，把c的对象的地址发给a
		B b = c;
		c.a1();
		c.b2();
		a.a1();
		// a.b2(); //报错 a中没有b2方法
		// b.a1(); //报错 b中没有a1方法
		b.b2();
	}

}

interface A {
	public abstract void a1();
}

interface B {
	public abstract void b2();
}

// 继承的单一性只能存在于类和类之间，接口之间可以多继承
interface D extends A, B {
}

class C implements A, B {

	@Override
	public void b2() {
	}

	@Override
	public void a1() {
	}

}