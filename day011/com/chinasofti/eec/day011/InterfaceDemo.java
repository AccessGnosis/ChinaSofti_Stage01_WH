/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InterfaceDemo.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: ����11:18:47
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

interface Runner extends Person { // �ӿڿ��Լ̳���һ���ӿ�
	public final static int PI = 3;

	public abstract void run();
}

class Demo implements Runner, Person { // һ�������ʵ�ֶ���ӿ�

	// ʵ�������ӿڻ�ʵ�������ӿڵķ���
	@Override
	public void run() {
	}

	@Override
	public void hunt() {
	}

}