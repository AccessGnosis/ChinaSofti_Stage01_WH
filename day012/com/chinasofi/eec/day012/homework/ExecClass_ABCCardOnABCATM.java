/**
* Describe: ִ���ࡪ��ũ�еĿ���ũ�е�ATM�ϲ���
* Keyword: 
* Hint: 
* Filename: ExecClass_ABCCardOnABCATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����5:30:13
*/
package com.chinasofi.eec.day012.homework;

public class ExecClass_ABCCardOnABCATM {
	public static void main(String[] args) {
		Unionpay abccard = new ABCCard(100, "123"); // �û�����������ʱ��100Ԫ��������123
		ATM abcatm = new ABCATM(); // ʵ����ũ�е�ATM������������ΪATM��
		abcatm.insertCard(abccard); // ��ũ�п���abccard������ũ�е�ATM����abcatm����
		abcatm.run(); // abcatm�����ˣ�������ִ���û�����
	}
}
