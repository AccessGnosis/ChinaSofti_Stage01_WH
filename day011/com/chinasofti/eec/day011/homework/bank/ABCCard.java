/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ABCCard.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:01:48
*/
package com.chinasofti.eec.day011.homework.bank;

public class ABCCard extends Card implements ABC {
	static long totalCardNum = 0;

	public ABCCard(double remaining) {
		super(remaining);
		totalCardNum++;
	}

	@Override
	public boolean payOnline(String from, String to, String account,
			double money) {
		if ((from.equals("1410074102")) && (to.equals("京东") || to.equals("淘宝"))
				&& account.equals(from) && getRemaining() >= money) {
			double list = getRemaining() - money;
			setRemaining(list);
			System.out.println("支付成功");
			System.out.println("您本次线上支付：" + money + "元");
			System.out.println("余额：" + getRemaining());
			return true;
		} else {
			return false;
		}
	}

}
