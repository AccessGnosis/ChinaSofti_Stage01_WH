/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ICBCCard.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:05:04
*/
package com.chinasofti.eec.day011.homework.bank;

public class ICBCCard extends Card implements ICBC {
	static long totalCardNum = 0;

	public ICBCCard(double remaining) {
		super(remaining);
		totalCardNum++;
	}

	@Override
	public boolean payCommunicationExpense(String to, String phoneNum,
			double money) {
		if (to.equals("中国联通") && phoneNum.equals("13060410958")
				&& getRemaining() - money >= 0) {
			double list = getRemaining() - money;
			setRemaining(list);
			System.out.println("支付成功");
			System.out.println("您本次为 " + phoneNum + " 交话费：" + money + "元");
			System.out.println("余额：" + getRemaining());
			return true;
		} else {
			return false;
		}
	}

}
