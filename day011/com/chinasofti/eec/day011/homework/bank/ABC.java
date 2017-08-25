/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ABC.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午2:47:31
*/
package com.chinasofti.eec.day011.homework.bank;

public interface ABC extends Unionpay {
	public abstract boolean payOnline(String from, String to, String account,
			double money); // 线上支付
}
