/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BankTest.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: ����3:29:37
*/
package com.chinasofti.eec.day011.homework.bank;

public class BankTest {

	/**
	 * ���п��ࣺCardʵ�ָ��ִ�ȡ��ͻ���
	 * ���У�ABCʵ������֧������
	 * ���У�CCBʵ�ֽ�ˮ��ѹ���
	 * ���У�ICBCʵ�ֽ����ѹ���
	 */
	public static void main(String[] args) {
		Unionpay a1 = new ABCCard(100); // ũ���û���100Ԫ����
		Unionpay c1 = new CCBCard(0); // �����û��޴���
		Unionpay i1 = new ICBCCard(1000); // �����û����1000����
		Unionpay a2 = new ABCCard(0);
		Unionpay a3 = new ABCCard(0);
		Unionpay a4 = new ABCCard(0);
		Unionpay c2 = new CCBCard(100);
		Unionpay c3 = new CCBCard(100);
		Unionpay c4 = new CCBCard(1000);
		Unionpay c5 = new CCBCard(10000);
		Unionpay i2 = new ICBCCard(0);

		System.out.println("ũ���û�a1��Ǯ100Ԫ");
		if (a1.depositMoney(100)) {
		} else {
			System.out.println("���ʧ��");
		}

		System.out.println();
		System.out.println("ũ���û�a1��Ǯ-100Ԫ���쳣���ݣ�");
		if (a1.depositMoney(-100)) {
		} else {
			System.out.println("���ʧ��");
		}

		System.out.println();
		System.out.println("�����û�ȡ��100Ԫ");
		if (c1.withdrawingMoney(100)) {
		} else {
			System.out.println("ȡ��ʧ�ܣ�����");
		}

		System.out.println();
		System.out.println("�����û�������100Ԫ");
		if (((ICBCCard) i1).payCommunicationExpense("�й���ͨ", "13060410958", 100)) {
		} else {
			System.out.println("�ɷ�ʧ��");
		}

		System.out.println();
		System.out.println("ũ����" + ABCCard.totalCardNum + "���û�");
		System.out.println("������" + CCBCard.totalCardNum + "���û�");
		System.out.println("������" + ICBCCard.totalCardNum + "���û�");

	}

}
