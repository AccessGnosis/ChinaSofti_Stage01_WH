/**
* Describe: ��д������ע������
* Keyword: ��д����
* Hint: ���෽���ķ���ֵ�͸��෽���ķ������ͱ�����ͬ
* Filename: OverrideDemo03.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: ����10:01:18
*/
package com.chinasofti.eec.day010;

public class OverrideDemo03 {

	public static void main(String[] args) {

	}

}

class Coo {
	void show() {

	}

	double say() {
		return 0.0;
	}

	Coo test() {
		return null;
	}
}

class Doo extends Coo {
	// int show() {//void��дʱ������ͬ��void �������ͷ����޷���ֵ�����෽�������з���ֵ
	void show() {
		return;
	}

	// int say(){ //����������дʱ������ͬ��������double���ͣ��͸���ķ���һ��
	double say() {
		return 1.0;
	}

	// Coo test() { // ����������дʱ���ڸ���
	// return new Coo();
	// }
	Doo test() {// ����������дС�ڸ�������
		return new Doo();
	}
	// �������Ϳ���С�ڵ��ڸ���
	// Eoo test(){
	// return new Eoo();
	// }
}

class Eoo {

}