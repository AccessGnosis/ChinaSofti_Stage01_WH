package com.chinasofti.eec.day002;

public class WhileLoopProgramDemo {

	public static void main(String[] args) {
		// ѭ����Ҫ�أ�
		// 1.ѭ�������ĳ�ʼ����
		// 2.ѭ����������ѭ������Ϊ�����ģ�
		// 3.ѭ�������ĸı䣨����ѭ��������
		int age = 1; // 1.ѭ�������ĳ�ʼ��
		while (age <= 10) { // 2.ѭ������
			System.out.println("������Ǯ");
			age++; // 3.ѭ�������ĸı䣨����ѭ��������
		}
		System.out.println("program over");

		// ���10�Σ��ж��ǳɹ��Ľ���
		int i = 0; // 1.ѭ�������ĳ�ʼ����
		while (i < 10) { // 2.ѭ����������ѭ������Ϊ�����ģ�
			System.out.println("��"+(i+1)+"�������"+"�ж��ǳɹ��Ľ���");
			i++; // 3.ѭ�������ĸı䣨����ѭ��������
		}
		System.out.println("program over");
	}

}
