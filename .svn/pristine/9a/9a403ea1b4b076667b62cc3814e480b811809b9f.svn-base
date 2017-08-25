/**
* Describe: 继承示例
* Keyword: extends
* Hint: 
* Filename: ExtendsDemo.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 下午2:36:51
*/
package com.chinasofti.eec.day009;

public class ExtendsDemo01 {

	public static void main(String[] args) {
		Coo coo = new Coo();
		coo.show();// Coo间接Boo继承Aoo

		Boo boo = new Boo();
		boo.show();// Boo除了Coo以外的所有类属性和方法

		Aoo aoo = new Aoo();
		aoo.show();// Aoo是Boo和Coo的父类，所以不能使用Boo和Coo的属性和方法

		// 对象能点出什么看类型
		Aoo oo1 = new Boo();
		Aoo oo2 = new Coo();
		Boo oo3 = new Coo();

	}

}

class Aoo {
	int a;

	void show() {
		System.out.println("Aoo.show()");
	}
}

class Boo extends Aoo {
	int b;

	void say() {
		System.out.println("Boo.say()");
	}
}

class Coo extends Boo {
	int c;

	void sayCoo() {
		System.out.println("Coo.sayCoo");
	}
}