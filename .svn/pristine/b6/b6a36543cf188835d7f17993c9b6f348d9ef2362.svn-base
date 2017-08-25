/**
* Describe: 执行类——工行的卡在通用的ATM上操作
* Keyword: 
* Hint: 
* Filename: ExecClass_ICBCCardOnATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午5:29:58
*/
package com.chinasofi.eec.day012.homework;

public class ExecClass_ICBCCardOnATM {
public static void main(String[] args) {
	Unionpay icbccard = new ICBCCard(100, "123");	// 用户开卡，开卡时存100元，密码是123
	ATM atm = new ATM();// 实例化ATM机
	atm.insertCard(icbccard);// 把工行卡（icbccard）插入ATM机（atm）中
	atm.run();// atm运行了，接下来执行用户操作
}
}
