/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BankTest.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:29:37
*/
package com.chinasofti.eec.day011.homework.bank;

public class BankTest {

	/**
	 * 银行卡类：Card实现各种存取款和汇款功能
	 * 龙行：ABC实现线上支付功能
	 * 建行：CCB实现交水电费功能
	 * 工行：ICBC实现交话费功能
	 */
	public static void main(String[] args) {
		Unionpay a1 = new ABCCard(100); // 农行用户存100元开卡
		Unionpay c1 = new CCBCard(0); // 建行用户无存款开卡
		Unionpay i1 = new ICBCCard(1000); // 工行用户存款1000开卡
		Unionpay a2 = new ABCCard(0);
		Unionpay a3 = new ABCCard(0);
		Unionpay a4 = new ABCCard(0);
		Unionpay c2 = new CCBCard(100);
		Unionpay c3 = new CCBCard(100);
		Unionpay c4 = new CCBCard(1000);
		Unionpay c5 = new CCBCard(10000);
		Unionpay i2 = new ICBCCard(0);

		System.out.println("农行用户a1存钱100元");
		if (a1.depositMoney(100)) {
		} else {
			System.out.println("存款失败");
		}

		System.out.println();
		System.out.println("农行用户a1存钱-100元（异常数据）");
		if (a1.depositMoney(-100)) {
		} else {
			System.out.println("存款失败");
		}

		System.out.println();
		System.out.println("建行用户取款100元");
		if (c1.withdrawingMoney(100)) {
		} else {
			System.out.println("取款失败，余额不足");
		}

		System.out.println();
		System.out.println("工行用户交话费100元");
		if (((ICBCCard) i1).payCommunicationExpense("中国联通", "13060410958", 100)) {
		} else {
			System.out.println("缴费失败");
		}

		System.out.println();
		System.out.println("农行有" + ABCCard.totalCardNum + "名用户");
		System.out.println("建行有" + CCBCard.totalCardNum + "名用户");
		System.out.println("工行有" + ICBCCard.totalCardNum + "名用户");

	}

}
