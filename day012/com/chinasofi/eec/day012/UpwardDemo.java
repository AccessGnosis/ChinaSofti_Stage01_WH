/**
* Describe: ��������ʾ��
* Keyword: 
* Hint: 
* Filename: UpwardDemo.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����11:24:13
*/
package com.chinasofi.eec.day012;

public class UpwardDemo {
	public static void main(String[] args) {
		Aoo o = new Coo(); // ��������
		Boo o1 = (Boo) o; // ǿת�ɹ�
		Coo co = (Coo) o; //
		// Doo do1 = (Doo)o; //�׳� java.lang.ClassCastException �쳣
		if (o instanceof Coo) {
			Coo do2 = (Coo) o; // ���޷�ǿ��ת���������쳣
			System.out.println("ǿת�ɹ�");
		} else {
			System.out.println("ǿתʧ��");
		}
	}
}

class Aoo {
	public void aooA() {

	}
}

interface Boo {
	public abstract void booA();
}

class Coo extends Aoo implements Boo {

	@Override
	public void booA() {
	}

}

class Doo extends Aoo {

}