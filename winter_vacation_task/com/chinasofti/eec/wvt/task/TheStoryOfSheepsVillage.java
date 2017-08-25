package com.chinasofti.eec.wvt.task;

import java.util.Scanner;

public class TheStoryOfSheepsVillage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Computer cp1 = new Computer();
		Person psn1 = new Person();

		System.out.println("---------------��ӭ���������Ϸ����---------------");
		System.out.println();
		System.out.println();
		System.out.println("               ****************");
		System.out.println("               **   ��Ϸ��ʼ   **");
		System.out.println("               ****************");
		System.out.println();
		System.out.println("��ȭ����1.ʯͷ��2.������3.��");

		while (true) {
			// ������Һ͵�������
			psn1.setName();
			cp1.setName();
			System.out.println();
			System.out.print("��ʼ��Ϸ��(y/n)��");
			String gameBegin = scan.next();

			if (gameBegin.equals("y") || gameBegin.equals("Y")) {
				break;
			} else {
				System.out.println("��Ϸ���¿�ʼ��������ѡ���ɫ��");
			}
		}
		System.out.println();

		// ��ʼ���÷�
		int count = 0;
		int psnWin = 0;
		int cpWin = 0;

		while (true) {
			System.out.println("---------------------------------------------");

			// ��ҳ�ȭ
			psn1.setStat();
			// ���Գ�ȭ
			cp1.setStat();

			System.out.println();
			System.out.println(psn1.getName() + "(��)��ȭ��" + psn1.showStatToString());
			System.out.println(cp1.getName() + "(����)��ȭ��" + cp1.showStatToString());

			// �жϲ�ȭ���
			if (psn1.getStat() == 1 && cp1.getStat() == 2) {
				psnWin++;
				psn1.setScore(psnWin);
				count++;
				System.out.println("������ã���Ӯ��");
			} else if (psn1.getStat() == 1 && cp1.getStat() == 3) {
				cpWin++;
				cp1.setScore(cpWin);
				count++;
				System.out.println("������˼��������");
			} else if (psn1.getStat() == 2 && cp1.getStat() == 1) {
				cpWin++;
				cp1.setScore(cpWin);
				count++;
				System.out.println("������˼��������");
			} else if (psn1.getStat() == 2 && cp1.getStat() == 3) {
				psnWin++;
				psn1.setScore(psnWin);
				count++;
				System.out.println("������ã���Ӯ��");
			} else if (psn1.getStat() == 3 && cp1.getStat() == 1) {
				psnWin++;
				psn1.setScore(psnWin);
				count++;
				System.out.println("������ã���Ӯ��");
			} else if (psn1.getStat() == 3 && cp1.getStat() == 2) {
				cpWin++;
				cp1.setScore(cpWin);
				count++;
				System.out.println("������˼��������");
			} else if (psn1.getStat() == cp1.getStat()) {
				count++;
				System.out.println("��ȭ��ͬ��ƽ��");
			}

			System.out.print("�Ƿ�ʼ��һ�֣�(y/n)��");
			String continueNext = scan.next();
			if (continueNext.equals("n") || continueNext.equals("N")) {
				System.out.println();
				System.out.println("---------------------------------------------");
				System.out.println("--------------------��Ϸ����-------------------");
				System.out.println("              " + psn1.getName() + "  V.S.  " + cp1.getName());
				System.out.println();
				System.out.println("������" + count);
				System.out.println("ƽ�֣�" + (count - psn1.getScore() - cp1.getScore()));
				System.out.println(psn1.getName() + "(��)�÷֣�" + psn1.getScore());
				System.out.println(cp1.getName() + "(����)�÷֣�" + cp1.getScore());
				System.out.println("---------------------------------------------");
				System.out.println("---------------------------------------------");
				break;
			}
		}
	}
}
