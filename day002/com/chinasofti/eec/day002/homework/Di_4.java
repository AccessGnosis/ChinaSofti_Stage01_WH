package com.chinasofti.eec.day002.homework;

import java.util.Scanner;

public class Di_4 {
	// ʹ�ó���Ϊ�û���¼��� 3 ����ֵ�����������У����������Ľ�����������̨��
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������������ÿպŸ�������");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = -2147483648, mid = -2147483648, min = -2147483648;

		System.out.println("��������������� " + a + "  " + b + "  " + c);

		if (a >= b && a >= c && b >= c) {
			// 000
			max = a;
			mid = b;
			min = c;
		} else if (a >= b && a >= c && b <= c) { // a>c>b
			// 001
			max = a;
			mid = c;
			min = b;
		} else if (a >= b && a <= c && b >= c) { // c>a>b
		} else if (a >= b && a <= c && b <= c) { // c>a>b
			max = c;
			mid = a;
			min = b;
		} else if (a <= b && a >= c && b >= c) { // b>a>c
			max = b;
			mid = a;
			min = c;
		} else if (a <= b && a >= c && b <= c) { // b>a>c
		} else if (a <= b && a <= c && b >= c) { // b>c>a
			max = b;
			mid = c;
			min = a;
		} else if (a <= b && a <= c && b <= c) { // c>b>a
			max = c;
			mid = b;
			min = a;
		}

		System.out.println("�������������� " + min + "  " + mid + "  " + max);
	}

}
