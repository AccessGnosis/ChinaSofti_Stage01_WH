/**
* Describe: ATM����ͨ��ATM��
* Keyword: 
* Hint: 
* Filename: ATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����4:55:13
*/
package com.chinasofi.eec.day012.homework;

import java.util.Scanner;

/**ATM������������ATM���ĸ���
�������е�ATM���̳д���*/
public class ATM {
	private Unionpay card; // ������

	public void insertCard(Unionpay card) { // �忨
		this.card = card;
	}

	public boolean run() { // ATM�����з���
		Scanner scan = new Scanner(System.in);
		System.out.print("���������룺");
		String pwd = scan.next();// �����û���������
		if (pwd.equals(((Card) card).getPassword())) {// ���û���������Ϳ�������������Ƚϣ���Ϊ����Unionpay�Ŀ�������Ҫ����ת����ȡgetPassword()�ķ���
			int command = 0;// �����û�����������ڿ����߼�����
			do {// ����ѭ����ֱ���û�ҵ��������
				System.out.println("��ѡ���ܣ�");
				System.out.println("1.��ѯ���  2.ȡ��  3.����  0.�˳�");
				command = scan.nextInt();// ��ȡ�û���������

				switch (command) {// �����û��������������Ϊ�ж�
				case 1:// ����û���Ҫ��ѯ���
					System.out.println("��������ǣ�Ԫ����" + card.getRemaining());// �����ʾ���
					break; // ����ѯ���
				case 2:
					System.out.print("����������ȡ���");
					int takenMoney = scan.nextInt();// ��ȡ�û���Ҫȡ����
					card.withdrawingMoney(takenMoney);// ����card��withdrawingMoney()������takenMoney����Ҫȡ��Ľ��
					break;// ȡ�����
				case 3:
					System.out.println("�������������е�ҵ��Ϊ��ѡ���������"); // ���ݿ����ͽ��в�ͬ���е�ҵ���ж�
					if (card instanceof CCBCard) { // ������ǽ��п�����ô�Ϳ��Խ����
						System.out.println("������ʹ�����Ľ��п�����ѣ��й�������");
						System.out.print("��������Ҫ�ɷѵĽ�");
						double toMoney = scan.nextDouble(); // ��ýɷѽ��
						((CCBCard) card).payUtilityBills("�й�����", toMoney); // ����CCBCard�����й��ܡ��������
																			// //Ϊ�˷��㣬ֻ��������뷽��
					}
					if (card instanceof ICBCCard) { // ������ǹ��п�����ô�ÿ��Խ�����
						System.out.println("������ʹ�����Ĺ��п�������");
						System.out.print("��������Ҫ�ɷѵĵ绰���룺");
						String phoneNum = scan.next(); // ��õ绰����
						System.out.print("��������Ҫ�ɷѵĽ�");
						double toMoney = scan.nextDouble(); // ��ýɷѽ��
						((ICBCCard) card).payCommunicationExpense("�й���ͨ",
								phoneNum, toMoney); // ����ICBCCard�����й��ܡ���������
													// //Ϊ�˷��㣬ֻ��������뷽��
					}
					if (card instanceof ABCCard) { // �������ũ�п�����ô�Ϳ�������֧��
						System.out.println("������ʹ������ũ�п�����֧��");
						System.out.print("��������Ҫ����Ľ�");
						double toMoney = scan.nextDouble(); // ��ȡ�ɷѽ��
						((ABCCard) card).payOnline("20170214757289478329147",
								"����", "1410074102", 100); // ����ABCCard�����й��ܡ�������֧��
															// //Ϊ�˷��㣬ֻ��������뷽��
					}
					break;
				case 0:
					System.out.println("лл����ʹ�ã����պÿ�Ƭ");// ���ѡ���˳�������ѭ��
					break;
				default:
					System.out.println("����ָ��������������������");// ���û����ȷѡ�����ҵ������
					break;
				}
			} while (command != 0);
			return true;
		} else {// ���������֤����
			System.out.println("�����������");
			return false;
		}
	}
}
