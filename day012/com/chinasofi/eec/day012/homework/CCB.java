/**
* Describe: CCB银行接口
* Keyword: 
* Hint: 
* Filename: CCB.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午2:47:26
*/
package com.chinasofi.eec.day012.homework;

/**CCB银行接口继承Unionpay银联接口*/
public interface CCB extends Unionpay {
	// 定义建设银行的特有功能——交电费
	public abstract boolean payUtilityBills(String to, double money); // 交电费
}
