/**
* Describe: ����
* Keyword: 
* Hint: 
* Filename: StaticFinalConst.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: ����4:27:11
*/
package com.chinasofti.eec.day010;

public class StaticFinalConst {

	public static void main(String[] args) {
		System.out.println(Roo.NUM); // ����ֱ�ӵ��ó���
		// Roo.PI�ڱ���ʱ���滻��3.1415926
		// Roo.NUM = 10;//�������NUM���ܱ��ı�

		System.out.println(Soo.NUM);
		/*
		 * 1.����Soo.class��������
		 * 2.��NUM����ڷ�������
		 * 3.ȥ�������л�ȡNUM��ֵ�����
		 */
		System.out.println(Soo.NUM2);
		// �ڱ���ʱֱ���滻�ɾ��������
		// �൱�������System.out.println(6);
	}

}

class Roo {
	public static final int NUM = 100;
	// public static final double PI;// ������󣬱���������ͬʱ��ʼ��
}

class Soo {
	public static int NUM = 5;// ��̬�������ǳ���
	public static final int NUM2 = 6;// ����һ������
}