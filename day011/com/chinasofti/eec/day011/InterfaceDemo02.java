/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InterfaceDemo02.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: ����1:39:36
*/
package com.chinasofti.eec.day011;

public class InterfaceDemo02 {

	public static void main(String[] args) {

	}

}

interface Aoo {
	public static final int NUM = 100;
	double PI = 3.14159; // �Զ���ȫ public static final
	// int NUM2;//������󣬱��븳��ֵ

	public abstract void show();

	void say(); // �Զ���ȫ public abstract

	// void say1(){} // ������ʵ�ַ���
}

interface Doo {
	void c();
}

interface Boo {
	void a();

	void b();
}

interface Eoo extends Doo {

}

interface Foo extends Doo, Boo {

}

abstract class Hoo {
	int i;

	public abstract void say2(); // �������е�abstract�ؼ��ֲ���ʡ��
}

class Ioo extends Hoo implements Doo, Boo {

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

	@Override
	public void say2() {
	}

}

class Coo implements Doo {

	@Override
	public void c() {
	}

}