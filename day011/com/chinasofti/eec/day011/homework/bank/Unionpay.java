/**
* Describe: �����ӿ�
* Keyword: 
* Hint: 
* Filename: Unionpay.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: ����2:43:01
*/
package com.chinasofti.eec.day011.homework.bank;

public interface Unionpay {
	// ��Ǯ
	// ȡǮ
	// ת��
	public abstract boolean depositMoney(double money); // ���
	public abstract boolean withdrawingMoney(double money); // ȡ��
	public abstract boolean transferAccounts(String account, double money); // ת��
}
