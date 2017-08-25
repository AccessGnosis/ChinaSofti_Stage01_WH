/**
* Describe: �ؼ��� static
* Keyword: ��̬��������̬��������̬��
* Hint: 
* Filename: StaticDemo.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: ����1:54:49
*/
package com.chinasofti.eec.day010;

public class StaticDemo {

	public static void main(String[] args) {
		Joo j1 = new Joo();
		Joo j2 = new Joo();
		System.out.println(j1.b); // ����ʹ��ʵ����������þ�̬����
		System.out.println(Joo.b); // һ��ʹ����������
		j1.say();
		Joo j3 = new Joo();
		j3.say();

		Koo ko = new Koo();
		ko.a = 1;
		ko.b = 2;// ������
		Koo.b = 2;
		ko.test();// �����飬��̬����ͨ����������
		Koo.test();

		Loo lo = new Loo();
		Loo lo1 = new Loo();// ��̬��������ֻ������һ��
		// lo1�в����ټ��ؾ�̬��
	}

}

class Joo {
	int a;// ʵ�����������ڶ���ģ������ڶ��� //�������
	static int b;// ��̬������������ģ������ڷ������� //��������

	public Joo() {
		a++;
		b++;
	}

	void say() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

class Koo {// ��֤��̬����
	int a;
	static int b;

	static {
		// ������ڼ䣬ִֻ��һ��
		System.out.println("Load Foo.class");
	}

	void show() {// ������ʽ��this����
		this.a = 1;
		this.b = 2; // ������
	}

	static void test() {// û����ʽ��this����
		// a = 1; //������󣬲��ܷ���ʵ������
		// this.a = 1;//����
		b++;// ��̬�������Է��ʾ�̬����
		System.out.println("static test()");
	}
}

class Loo {
	public Loo() {
		System.out.println("Loo���޲ι��췽����������");
	}

	static {
		System.out.println("Loo�ľ�̬�鱻������");
	}
}