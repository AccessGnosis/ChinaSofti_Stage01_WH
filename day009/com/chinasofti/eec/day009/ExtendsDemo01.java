/**
* Describe: �̳�ʾ��
* Keyword: extends
* Hint: 
* Filename: ExtendsDemo.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: ����2:36:51
*/
package com.chinasofti.eec.day009;

public class ExtendsDemo01 {

	public static void main(String[] args) {
		Coo coo = new Coo();
		coo.show();// Coo���Boo�̳�Aoo

		Boo boo = new Boo();
		boo.show();// Boo����Coo��������������Ժͷ���

		Aoo aoo = new Aoo();
		aoo.show();// Aoo��Boo��Coo�ĸ��࣬���Բ���ʹ��Boo��Coo�����Ժͷ���

		// �����ܵ��ʲô������
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