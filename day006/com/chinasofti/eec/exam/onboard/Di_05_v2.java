package com.chinasofti.eec.exam.onboard;

import java.util.Arrays;
import java.util.Scanner;

public class Di_05_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[2];
		System.out.print("�������һ��������");
		num[0] = scan.nextInt();
		System.out.print("������ڶ���������");
		num[1] = scan.nextInt();

		int sum = 0;

		Arrays.sort(num);

		for (int begin = num[0] + 1; begin < num[1]; ++begin) {
			if (begin % 5 == 0) {
				sum += begin;
			}
		}
		System.out.println("���������������֮���ܱ�5�������������ǣ�" + sum);
	}

}
