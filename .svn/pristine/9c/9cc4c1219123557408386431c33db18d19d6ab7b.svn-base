/**
* Describe: 方法的重载
* Keyword: 方法；重载
* Hint: 重载：方法名相同，参数列表不同，称为方法的重载
* 	    方法的签名：方法名+参数列表
* 		方法的重载在什么时候调用
* Filename: OverloadDemo.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 下午4:20:27
*/
package com.chinasofti.eec.day007;

public class OverloadDemo {

	public static void main(String[] args) {
		study();
		System.out.println(study("I'm good boy"));
		System.out.println();
		Aoo a = new Aoo();
		a.show();
		a.show(18);
		a.show("张三");
		a.show(18, "张三"); // 重载方法：方法名相同，参数列表不同
		a.show("张三", 18);
	}

	public static void study() {
		System.out.println("I'm good boy");
	}

	public static String study(String name) {
		return name;
	}
}

class Aoo {
	public void show() {
		System.out.println("123456");
	}

	public void show(String name) {
		System.out.println(name);
	}

	public void show(int age) {
		System.out.println(age);
	}

	public void show(int age, String name) {
		System.out.println("名字 " + name + "\t年龄 " + age);
	}

	public void show(String name, int age) {
		System.out.println("名字 " + name + "\t年龄 " + age);
	}
	// public int show(){} //编译错误，与返回值无关
	// public void show(String address){} //编译错误，与参数的名称无关
}