/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AnonymousInnerClass02.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午3:52:00
*/
package com.chinasofi.eec.day012;

public class AnonymousInnerClass02 {
	public static void main(String[] args) {
		// Inter2 o1 = new Inter2(); //编译错误，接口不能实例化
		// 创建一个Inter2的子类，没有名字
		// 为这个子类创建一个对象，起名叫o2
		// {}中放的是这个子类的类体
		Inter2 o2 = new Inter2() {

		};
		final int num = 8;
		Inter3 o3 = new Inter3() {
			public void show() {
				System.out.println(num); // num必须为final的
				System.out.println("hello");
			}
		};
		o3.show();
	}
}

interface Inter2 {

}

interface Inter3 {
	void show(); // 子类需要实现接口
}