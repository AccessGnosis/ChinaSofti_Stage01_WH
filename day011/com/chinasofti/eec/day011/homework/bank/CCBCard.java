/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CCBCard.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: ����3:04:55
*/
package com.chinasofti.eec.day011.homework.bank;

public class CCBCard extends Card implements CCB {
	static long totalCardNum = 0;

	public CCBCard(double remaining) {
		super(remaining);
		totalCardNum++;
	}

	@Override
	public boolean payUtilityBills(String to, double money) {
		if (to.equals("�й�����") && getRemaining() - money >= 0) {
			double list = getRemaining() - money;
			setRemaining(list);
			System.out.println("֧���ɹ�");
			System.out.println("�����ν���ѣ�" + money + "Ԫ");
			System.out.println("��" + getRemaining());
			return true;
		} else {
			return false;
		}
	}

}
