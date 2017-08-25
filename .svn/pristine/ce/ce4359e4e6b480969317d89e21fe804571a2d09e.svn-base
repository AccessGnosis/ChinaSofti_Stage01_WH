/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InterfaceDemo.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 上午11:18:47
*/
package com.chinasofti.eec.day011;

public class InterfaceDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.PI);
	}
}

interface Person {
	public abstract void hunt();
}

class Athltic {
}

interface Runner extends Person { // 接口可以继承另一个接口
	public final static int PI = 3;

	public abstract void run();
}

class Demo implements Runner, Person { // 一个类可以实现多个接口

	// 实现两个接口会实现两个接口的方法
	@Override
	public void run() {
	}

	@Override
	public void hunt() {
	}

}