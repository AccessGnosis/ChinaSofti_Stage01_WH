package com.chinasofti.eec.day002;

import java.util.Scanner;

public class IfProgramDemo {

	public static void main(String[] args) {
		// if:���������㣬��ִ��{}
		// �����������㣬��ִ��{}
		Scanner scan = new Scanner(System.in);
		System.out.println("���������֣�");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "��ż��");
		}
		System.out.println("over"); // Ҫ��if-else���ֿ���������ִ��

		// if() {
		// ����1
		// }
		// else {
		// ����2
		// }
		System.out.println("���������֣�");
		int num1 = scan.nextInt();
		if (num1 % 2 == 0) {
			System.out.println(num1 + "��ż��");
		} else {
			System.out.println(num1 + "������");
		}
		System.out.println("over");
	}

}
