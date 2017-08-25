/**
* Describe: ABCATM��ũҵ���е�ATM����
* Keyword: 
* Hint: 
* Filename: ABCATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����5:21:04
*/
package com.chinasofi.eec.day012.homework;

import java.util.Scanner;

/**����ũ��ATM��������ũ�����е�
�̳���ATM������*/
public class ABCATM extends ATM {
	private Unionpay card; // ������

	public void insertCard(Unionpay card) { // �忨����
		this.card = card;
	}
	// �жϿ�������
	public boolean judgeCardType() {
		if (card instanceof ABCCard) {// �����ũ�п�
			this.card = (ABCCard) card; // ��������ǿ������ת��Ϊũ�п�
			return true; // ��������ж�����
		} else { // �������ũ�п�
			return false;// ���ؼٵ�����
		}
	}

	public boolean run() { // ATM�����з���
		Scanner scan = new Scanner(System.in);
		System.out.print("���������룺");
		String pwd = scan.next(); // �����û���������
		if (pwd.equals(((Card) card).getPassword())) { // ���û���������Ϳ�������������Ƚϣ���Ϊ����Unionpay�Ŀ�������Ҫ����ת����ȡgetPassword()�ķ���
			int command = 0; // �����û�����������ڿ����߼�����
			do { // ����ѭ����ֱ���û�ҵ��������
				System.out.println("��ѡ���ܣ�");
				System.out.println("1.��ѯ���  2.ȡ��  3.����֧��  0.�˳�");
				command = scan.nextInt(); // ��ȡ�û���������

				switch (command) { // �����û��������������Ϊ�ж�
				case 1: // ����û���Ҫ��ѯ���
					System.out.println("��������ǣ�Ԫ����" + card.getRemaining()); // �����ʾ���
					break; // ����ѯ���
				case 2:
					System.out.print("����������ȡ���");
					int takenMoney = scan.nextInt();// ��ȡ�û���Ҫȡ����
					card.withdrawingMoney(takenMoney); // ����card��withdrawingMoney()������takenMoney����Ҫȡ��Ľ��
					break;// ȡ�����
				case 3:
					if (judgeCardType()) { // �жϿ�����
						// �����ũ�п�
						System.out.print("��������Ҫ����Ľ�");
						double toMoney = scan.nextDouble(); // ��ȡ֧�����
						((ABCCard) card).payOnline("20170214757289478329147",
								"����", "1410074102", toMoney); // �˴�Ϊ�˷��㣬��������Ϊ������ֻ��toMoney��֧������ͨ������ı�
					} else { // �������ũ�п�
						System.out.println("���Ŀ�����ũҵ���еĿ����޷�����֧��");
					}
					break;
				case 0:
					System.out.println("лл����ʹ�ã����պÿ�Ƭ"); // ���ѡ���˳�������ѭ��
					break;
				default:
					System.out.println("����ָ��������������������"); // ���û����ȷѡ�����ҵ������
					break;
				}
			} while (command != 0);
			return true;
		} else { // ���������֤����
			System.out.println("�����������");
			return false;
		}
	}
}
