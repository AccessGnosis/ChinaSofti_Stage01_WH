/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StaticDemo_CatCount.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 下午1:49:14
*/
package com.chinasofti.eec.day010;

public class StaticDemo_CatCount {

	public static void main(String[] args) {
		Cat c1 = new Cat(2); // c1、c2在栈内存中，内容在堆内存中
		Cat c2 = new Cat(3);
		System.out.println("有" + Cat.getNumOfCats() + "只猫");
	}

}

class Cat {
	private int age;
	private static int numOfCats; // 在方法区中

	public Cat(int age) {
		this.age = age;
		++numOfCats;
	}

	public static int getNumOfCats() {
		return numOfCats;
	}
}