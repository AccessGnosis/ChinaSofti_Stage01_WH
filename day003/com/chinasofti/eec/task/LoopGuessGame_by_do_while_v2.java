package com.chinasofti.eec.task;

import java.util.Scanner;

public class LoopGuessGame_by_do_while_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random() * 1000) + 1;
		System.out.println("���ص����ǣ�" + num);
		int guess;

		do {
			System.out.println("�°ɣ�");
			guess = scan.nextInt();
			if (guess == 0) {
				break;
			} else if (guess > num) {
				System.out.println("��µ�̫����");
			} else if (guess < num) {
				System.out.println("��µ�̫С��");
			}
		} while (guess != num);
		if (guess == num) {
			System.out.println("��ϲ���¶���");
		} else {
			System.out.println("��ӭ���´�����");
		}
	}

}
