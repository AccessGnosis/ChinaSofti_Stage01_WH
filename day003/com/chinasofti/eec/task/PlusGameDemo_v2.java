package com.chinasofti.eec.task;

import java.util.Scanner;

public class PlusGameDemo_v2 {

	public static void main(String[] args) {
		int score = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int result = a + b;

			System.out.println("(" + i + ")" + a + "+" + b + "=?");
			System.out.print("����⣺");
			int answer = scan.nextInt();
			if (answer == -1) {
				break;
			} else if (answer == result) {
				System.out.println("�����");
				score += 10;
			} else {
				System.out.println("�����");
			}
		}
		System.out.println("���ķ����ǣ�" + score);
	}

}
