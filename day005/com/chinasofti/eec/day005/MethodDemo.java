package com.chinasofti.eec.day005;

public class MethodDemo {
	public static void main(String[] args) {
		sayMethod();
		sayMethod("��Һ�");
		sayMethod(123321);

		String str = say();
		System.out.println(str);
		System.out.println(say()); // �����飬����Ƕ�׷���

		double sum = sum(Math.PI, Math.E);
		System.out.println(sum);
	}

	// �޲��޷���ֵ
	public static void sayMethod() {
		System.out.println("sayMethod()������������");
		return;
	}

	// �в��޷���ֵ
	public static void sayMethod(String str) {
		System.out.println("sayMethod()����˵:" + str);
	}

	// �в��޷���ֵ
	public static void sayMethod(int a) {
		System.out.println("sayMethod()����˵:" + a);
	}

	// �޲��з���ֵ
	public static String say() {
		// return����������Ҫ�ͷ���ֵһ��
		return "say()�޲��з���ֵ�ķ���"; // return������������ִ�У�����һ����������÷���
	}

	// �в��з���ֵ
	public static double sum(double a, double b) {
		return a + b;
	}
}
