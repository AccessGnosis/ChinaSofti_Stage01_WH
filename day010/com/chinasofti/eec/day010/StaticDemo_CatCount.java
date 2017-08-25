/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StaticDemo_CatCount.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: ����1:49:14
*/
package com.chinasofti.eec.day010;

public class StaticDemo_CatCount {

	public static void main(String[] args) {
		Cat c1 = new Cat(2); // c1��c2��ջ�ڴ��У������ڶ��ڴ���
		Cat c2 = new Cat(3);
		System.out.println("��" + Cat.getNumOfCats() + "ֻè");
	}

}

class Cat {
	private int age;
	private static int numOfCats; // �ڷ�������

	public Cat(int age) {
		this.age = age;
		++numOfCats;
	}

	public static int getNumOfCats() {
		return numOfCats;
	}
}