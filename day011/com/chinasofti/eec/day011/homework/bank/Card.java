/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Card.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: ����3:09:00
*/
package com.chinasofti.eec.day011.homework.bank;

public class Card implements Unionpay {
	private double remaining;

	public Card(double remaining) {
		this.remaining = remaining;
	}

	public double getRemaining() {
		return remaining;
	}

	public void setRemaining(double remaining) {
		this.remaining = remaining;
	}

	@Override
	public boolean depositMoney(double money) {
		if (money > 0) {
			remaining += money;
			System.out.println("�����δ��룺" + money + "Ԫ");
			System.out.println("��" + remaining);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean withdrawingMoney(double money) {
		if (remaining >= money) {
			remaining -= money;
			System.out.println("������ȡ�" + money + "Ԫ");
			System.out.println("��" + remaining);
			return true;
		} else {
			System.out.println("������" + getRemaining());
			return false;
		}
	}

	@Override
	public boolean transferAccounts(String account, double money) {
		if (account.length() == 10 && remaining >= money) { // �˻����ڲ���������
			remaining -= money;
			System.out.println("�����θ� " + account + " ת�ˣ�" + money + "Ԫ");
			System.out.println("��" + remaining);
			return true;
		} else {
			return false;
		}

	}
}
