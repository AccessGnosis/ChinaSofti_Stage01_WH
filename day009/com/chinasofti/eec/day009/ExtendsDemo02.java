/**
* Describe: ��ʾ�̳��еĹ��췽����ע������
* Keyword: constructor, extends, attention
* Hint: ʵ���������ȵ��������޲ι��죬Ȼ���ٵ��ø����޲ι���
* Filename: ExtendsDemo02.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: ����3:02:49
*/
package com.chinasofti.eec.day009;

public class ExtendsDemo02 {

	public static void main(String[] args) {
		Eoo e = new Eoo();
	}

}

class Doo {
	Doo() {
		System.out.println("������޲ι���");
	}
}

class Eoo extends Doo {
	Eoo() {
		// super();//���ø�����޲ι��췽��
		System.out.println("������޲ι���");
	}
}