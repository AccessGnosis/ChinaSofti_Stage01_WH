/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: UnionPayDemo.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����1:59:16
*/
package com.chinasofi.eec.day012.bankdemo;

public class UnionPayDemo {

	public static void main(String[] args) {
		// ICBCImpl icard1 = new ICBCImpl(); // ����һ�����п�
		// ICBC icard2 = new ICBCImpl(); // ��������
		// UnionPay icard3 = new ICBCImpl(); // ��������

		// ABC icard4 = new ICBCImpl(); // ��������޷�����
		ABCATM atm = new ABCATM(); // ����ATM������
		UnionPay card = new ABCImpl(); // ����������ũ�п�
		atm.insertCard(card); // �忨
		atm.payPhoneFee(); // �ɷ�

		UnionPay cardIcbc = new ICBCImpl();
		atm.insertCard(cardIcbc);
		atm.payPhoneFee();
	}
}

// ����ATM
class ABCATM { // ũ��ATM��
	private UnionPay card; // ������

	public void insertCard(UnionPay card) { // �忨
		this.card = card;
	}
	public boolean payPhoneFee() { // ֧���绰��
		if (card instanceof ABC) { // ��ũ�п�
			ABC abcCard = (ABC) card; // ��������ǿת��ũ�п�
			abcCard.payTelFee("13060410958", 30);// ֧���绰��
			System.out.println("�ɷѳɹ�");
			return true;
		} else {
			System.out.println("����ũ�п������ܽ�����");
			return false;
		}
	}
}

// �����ӿ�
interface UnionPay {
	// ȡ���
	boolean drawMoney(int num);
	// �鿴���
	double getBalance();
	// �鿴�����Ƿ���ȷ
	boolean cheackPwd(String input);
}

// ���нӿ�
interface ICBC extends UnionPay {
	// ����֧��
	boolean payOnline(double num);
}

// ũ�нӿ�
interface ABC extends UnionPay {
	// ֧���绰��
	boolean payTelFee(String phoneNum, double num);
}

// ���нӿ�
interface CCB extends UnionPay {
	// ��ˮ��
	boolean payWaterFee(int num);
}

// ũ�п�
class ABCImpl implements ABC {

	@Override
	public boolean drawMoney(int num) {
		return false;
	}

	@Override
	public double getBalance() {
		return 0;
	}

	@Override
	public boolean cheackPwd(String input) {
		return false;
	}

	@Override
	public boolean payTelFee(String phoneNum, double num) {
		return false;
	}
}

// ���п�
class ICBCImpl implements ICBC {

	@Override
	public boolean drawMoney(int num) {
		return false;
	}

	@Override
	public double getBalance() {
		return 0;
	}

	@Override
	public boolean cheackPwd(String input) {
		return false;
	}

	@Override
	public boolean payOnline(double num) {
		return false;
	}
}

// ���п�
class CCBImpl implements CCB {

	@Override
	public boolean drawMoney(int num) {
		return false;
	}

	@Override
	public double getBalance() {
		return 0;
	}

	@Override
	public boolean cheackPwd(String input) {
		return false;
	}

	@Override
	public boolean payWaterFee(int num) {
		return false;
	}
}