/**
* Describe: 银联接口
* Keyword: 
* Hint: 
* Filename: Unionpay.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午2:43:01
*/
package com.chinasofi.eec.day012.homework;

/**
 * 银联接口
 */
public interface Unionpay {
	// 实现以下功能
	// 存钱
	// 取钱
	// 转账
	public abstract boolean depositMoney(double money); // 存款
	public abstract boolean withdrawingMoney(double money); // 取款
	public abstract boolean transferAccounts(String account, double money); // 转账
	public abstract double getRemaining();
}
