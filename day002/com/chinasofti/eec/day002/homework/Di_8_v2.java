package com.chinasofti.eec.day002.homework;

import java.util.Scanner;

public class Di_8_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);

		// ��Ŀ����������ٴ������࣬�߼���������
		int max = (a > b ? a : b) < c ? c : (a > b ? a : b);
		System.out.println("���ֵ�ǣ�" + max);
	}

}
