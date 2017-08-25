/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Card.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:09:00
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
			System.out.println("您本次存入：" + money + "元");
			System.out.println("余额：" + remaining);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean withdrawingMoney(double money) {
		if (remaining >= money) {
			remaining -= money;
			System.out.println("您本次取款：" + money + "元");
			System.out.println("余额：" + remaining);
			return true;
		} else {
			System.out.println("卡内余额：" + getRemaining());
			return false;
		}
	}

	@Override
	public boolean transferAccounts(String account, double money) {
		if (account.length() == 10 && remaining >= money) { // 账户存在并且余额充足
			remaining -= money;
			System.out.println("您本次给 " + account + " 转账：" + money + "元");
			System.out.println("余额：" + remaining);
			return true;
		} else {
			return false;
		}

	}
}
