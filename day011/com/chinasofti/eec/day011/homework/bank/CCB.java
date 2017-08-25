/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CCB.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午2:47:26
*/
package com.chinasofti.eec.day011.homework.bank;

public interface CCB extends Unionpay {
	public abstract boolean payUtilityBills(String to, double money); // 交水电费
}
