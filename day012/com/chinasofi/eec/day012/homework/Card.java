/**
* Describe: 卡（父类）的功能
* Keyword: 
* Hint: 实现所有银行卡都具有的功能
* Filename: Card.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:09:00
*/
package com.chinasofi.eec.day012.homework;

/**Card实现Unionpay接口
实现银联卡最基本的功能*/
public class Card implements Unionpay {
	private double remaining; // 余额
	private String password; // 密码

	public Card(double remaining, String password) { // 构造方法，供所有子类使用
		this.remaining = remaining; // 初始化余额
		this.password = password; // 初始化密码
	}

	public double getRemaining() { // 获取余额
		return remaining;
	}

	public void setRemaining(double remaining) { // 设置余额
		this.remaining = remaining;
	}
	public String getPassword() { // 设置密码
		return password;
	}

	@Override
	public boolean depositMoney(double money) { // 实现接口的存款方法
		if (money > 0) { // 如果存钱了
			remaining += money; // 余额增加
			System.out.println("您本次存入：" + money + "元"); // 输出信息
			System.out.println("余额：" + remaining);
			return true;
		} else { // 如果没存钱（参数错误的情况）
			return false;
		}
	}

	@Override
	public boolean withdrawingMoney(double money) { // 实现接口的取款方法
		if (remaining >= money) { // 如果余额大于取的钱数
			remaining -= money; // 余额减少
			System.out.println("您本次取款：" + money + "元"); // 输出提示信息
			System.out.println("余额：" + remaining);
			return true;
		} else { // 如果余额不足
			System.out.println("卡内余额：" + getRemaining());
			return false;
		}
	}

	@Override
	public boolean transferAccounts(String account, double money) { // 实现接口的转账功能（功能写了，没有实现，可后期增加功能）
		if (account.length() == 10 && remaining >= money) { // 账户存在并且余额充足
			// accout.length()是判断账户的长度
			remaining -= money; // 余额减少
			System.out.println("您本次给 " + account + " 转账：" + money + "元"); // 提示信息输出
			System.out.println("余额：" + remaining);
			return true;
		} else {
			return false;
		}

	}
}
