/**
* Describe: 执行类——农行的卡在通用的ATM上操作
* Keyword: 
* Hint: 
* Filename: ExecClass_ABCCardOnATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午5:29:44
*/
package com.chinasofi.eec.day012.homework;

public class ExecClass_ABCCardOnATM {

	public static void main(String[] args) {
		Unionpay abccard = new ABCCard(1000, "123");// 用户开卡，开卡时存1000元，密码是123
		ATM atm = new ATM();// 实例化ATM机
		atm.insertCard(abccard);// 把农行卡（abccard）插入ATM机（atm）中
		atm.run();// atm运行了，接下来执行用户操作
	}

}
