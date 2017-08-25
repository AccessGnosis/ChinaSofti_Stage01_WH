/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: UnionPayDemo.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午1:59:16
*/
package com.chinasofi.eec.day012;

public class UnionPayDemo {

	public static void main(String[] args) {
		ICBCImpl icard1 = new ICBCImpl(); // 创建一个工行卡
		ICBC icard2 = new ICBCImpl(); // 向上造型
		UnionPay icard3 = new ICBCImpl(); // 向上造型

		// ABC icard4 = new ICBCImpl(); // 编译错误，无法创建
	}
}

// 银联接口
interface UnionPay {
	// 取款功能
	boolean drawMoney();
	// 查看余额
	double getBalance();
	// 查看密码是否正确
	boolean cheackPwd();
}

// 工行接口
interface ICBC extends UnionPay {
	// 在线支付
	boolean payOnline();
}

// 农行接口
interface ABC extends UnionPay {
	// 支付电话费
	boolean payTelFee();
}

// 建行接口
interface CCB extends UnionPay {
	// 交水费
	boolean payWaterFee();
}

// 农行卡
class ABCImpl implements ABC {
	@Override
	public boolean drawMoney() {
		return false;
	}
	@Override
	public double getBalance() {
		return 0;
	}
	@Override
	public boolean cheackPwd() {
		return false;
	}
	@Override
	public boolean payTelFee() {
		return false;
	}
}

// 工行卡
class ICBCImpl implements ICBC {
	@Override
	public boolean drawMoney() {
		return false;
	}

	@Override
	public double getBalance() {
		return 0;
	}
	@Override
	public boolean cheackPwd() {
		return false;
	}
	@Override
	public boolean payOnline() {
		return false;
	}
}

// 建行卡
class CCBImpl implements CCB {
	@Override
	public boolean drawMoney() {
		return false;
	}
	@Override
	public double getBalance() {
		return 0;
	}
	@Override
	public boolean cheackPwd() {
		return false;
	}
	@Override
	public boolean payWaterFee() {
		return false;
	}
}