package com.chinasofti.eec.day003;

public class ScopeDemo {
	// c�����඼��ʹ�ã����ǵ��Ǿ�̬����
	static int c = 3;

	public static void main(String[] args) {
		// ������������Χ
		// �ӱ�����������ʼ��������������Ĵ����Ž���
		// ������ͬ�����⣺
		// �������������ص�ʱ����������ͬ��
		int a = 5;
		int c = 10; // �;�̬������ͬ��������ͬ��
		if (a > 2) {
			int b = 6;
			// int a = 4; //������󣬷�Χ���������ص�ʱ����������ͬ��
			System.out.println("a����2");
			System.out.println(b);
		} else {
			int b = 9; // ���Լ�������b���ϸ�b����������if��
			System.out.println("a������" + a);
			// System.out.println(b); //����b�Ǿֲ��������˴��޷�ʹ��
		}
		System.out.println(ScopeDemo.c);
		System.out.println(c);
		syso();
	}

	private static void syso() {
		System.out.println(c);
		// System.out.println(a); // a���������ڷ�Χ������ʹ��
	}

}
