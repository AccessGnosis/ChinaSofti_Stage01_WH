/**
* Describe: ִ���ࡪ�����еĿ���ͨ�õ�ATM�ϲ���
* Keyword: 
* Hint: 
* Filename: ExecClass_ICBCCardOnATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����5:29:58
*/
package com.chinasofi.eec.day012.homework;

public class ExecClass_ICBCCardOnATM {
public static void main(String[] args) {
	Unionpay icbccard = new ICBCCard(100, "123");	// �û�����������ʱ��100Ԫ��������123
	ATM atm = new ATM();// ʵ����ATM��
	atm.insertCard(icbccard);// �ѹ��п���icbccard������ATM����atm����
	atm.run();// atm�����ˣ�������ִ���û�����
}
}
