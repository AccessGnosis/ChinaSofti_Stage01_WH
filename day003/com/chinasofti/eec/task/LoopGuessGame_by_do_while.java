package com.chinasofti.eec.task;

import java.util.Random;
import java.util.Scanner;

public class LoopGuessGame_by_do_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��������һ����(����0�˳�)");
		int num = (int) (Math.random() * 10 + 1);
		System.out.println("��������ǣ�" + num);
		int cusNum = scan.nextInt();

		do {
			if (cusNum == 0) {
				System.exit(-1);
			}
			if (cusNum > num) {
				System.out.print("���µ������ˣ�");
			} else {
				System.out.print("���µ���С�ˣ�");
			}
			System.out.println("�����²�(����0�˳�)");
			cusNum = scan.nextInt();
		} while (cusNum != num); // �ж�����������Ϊ�����ѭ��

		System.out.println("��ϲ�����¶���");
	}

}
