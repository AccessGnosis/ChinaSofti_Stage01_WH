/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: UnionPayDemo.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午1:59:16
*/
package com.chinasofi.eec.day012.bankdemo;

public class UnionPayDemo {

	public static void main(String[] args) {
		// ICBCImpl icard1 = new ICBCImpl(); // 创建一个工行卡
		// ICBC icard2 = new ICBCImpl(); // 向上造型
		// UnionPay icard3 = new ICBCImpl(); // 向上造型

		// ABC icard4 = new ICBCImpl(); // 编译错误，无法创建
		ABCATM atm = new ABCATM(); // 创建ATM机对象
		UnionPay card = new ABCImpl(); // 银联卡——农行卡
		atm.insertCard(card); // 插卡
		atm.payPhoneFee(); // 缴费

		UnionPay cardIcbc = new ICBCImpl();
		atm.insertCard(cardIcbc);
		atm.payPhoneFee();
	}
}

// 创建ATM
class ABCATM { // 农行ATM机
	private UnionPay card; // 银联卡

	public void insertCard(UnionPay card) { // 插卡
		this.card = card;
	}
	public boolean payPhoneFee() { // 支付电话费
		if (card instanceof ABC) { // 是农行卡
			ABC abcCard = (ABC) card; // 将银联卡强转成农行卡
			abcCard.payTelFee("13060410958", 30);// 支付电话费
			System.out.println("缴费成功");
			return true;
		} else {
			System.out.println("不是农行卡，不能交话费");
			return false;
		}
	}
}

// 银联接口
interface UnionPay {
	// 取款功能
	boolean drawMoney(int num);
	// 查看余额
	double getBalance();
	// 查看密码是否正确
	boolean cheackPwd(String input);
}

// 工行接口
interface ICBC extends UnionPay {
	// 在线支付
	boolean payOnline(double num);
}

// 农行接口
interface ABC extends UnionPay {
	// 支付电话费
	boolean payTelFee(String phoneNum, double num);
}

// 建行接口
interface CCB extends UnionPay {
	// 交水费
	boolean payWaterFee(int num);
}

// 农行卡
class ABCImpl implements ABC {

	@Override
	public boolean drawMoney(int num) {
		return false;
	}

	@Override
	public double getBalance() {
		return 0;
	}

	@Override
	public boolean cheackPwd(String input) {
		return false;
	}

	@Override
	public boolean payTelFee(String phoneNum, double num) {
		return false;
	}
}

// 工行卡
class ICBCImpl implements ICBC {

	@Override
	public boolean drawMoney(int num) {
		return false;
	}

	@Override
	public double getBalance() {
		return 0;
	}

	@Override
	public boolean cheackPwd(String input) {
		return false;
	}

	@Override
	public boolean payOnline(double num) {
		return false;
	}
}

// 建行卡
class CCBImpl implements CCB {

	@Override
	public boolean drawMoney(int num) {
		return false;
	}

	@Override
	public double getBalance() {
		return 0;
	}

	@Override
	public boolean cheackPwd(String input) {
		return false;
	}

	@Override
	public boolean payWaterFee(int num) {
		return false;
	}
}