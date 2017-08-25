/**
* Describe: 方法的重写
* Keyword: 子类；父类
* Hint: 子类继承方法的重写，无论通过子类的引用调用还是父类的引用调用，运行的都是
* 		子类重写过的版本。
* Filename: OverrideDemo.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 上午9:44:26
*/
package com.chinasofti.eec.day010;

public class OverrideDemo01 {

	public static void main(String[] args) {
		Boo bo1 = new Boo();// 子类的引用调用重写后的方法
		bo1.say(); // 输出 Boo
		Aoo bo2 = new Boo();
		bo2.say();// 输出 Boo，调用Boo类中的say()方法
	}

}

class Aoo {
	void say() {
		System.out.println("Aoo");
	}
}

class Boo extends Aoo {
	void say() {
		System.out.println("Boo");
	}
}