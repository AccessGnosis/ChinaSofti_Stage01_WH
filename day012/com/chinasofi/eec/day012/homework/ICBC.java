/**
* Describe: ICBC银行接口
* Keyword: 
* Hint: 
* Filename: ICBC.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午2:47:07
*/
package com.chinasofi.eec.day012.homework;

/**
 * ICBC银行接口继承Unionpay银联接口
 */
public interface ICBC extends Unionpay {
	//定义工商银行的特有功能——交话费
	public abstract boolean payCommunicationExpense(String to, String phoneNum, double money); // 交话费
}
