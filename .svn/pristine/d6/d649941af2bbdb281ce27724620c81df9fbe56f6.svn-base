/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CCBCard.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:04:55
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
		if (to.equals("中国电网") && getRemaining() - money >= 0) {
			double list = getRemaining() - money;
			setRemaining(list);
			System.out.println("支付成功");
			System.out.println("您本次交电费：" + money + "元");
			System.out.println("余额：" + getRemaining());
			return true;
		} else {
			return false;
		}
	}

}
