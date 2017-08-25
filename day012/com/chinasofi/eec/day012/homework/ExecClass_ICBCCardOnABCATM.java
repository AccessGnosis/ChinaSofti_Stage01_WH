/**
* Describe: 执行类——工行的卡在农行的ATM上操作
* Keyword: 
* Hint: 
* Filename: ExecClass_ICBCCardOnABCATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午5:30:35
*/
package com.chinasofi.eec.day012.homework;

public class ExecClass_ICBCCardOnABCATM {

	public static void main(String[] args) {
		Unionpay icbccard = new ICBCCard(10000, "123");// 用户开卡，开卡时存10000元，密码是123
		ATM abcatm = new ABCATM();// 实例化农行的ATM机，向上造型为ATM机
		abcatm.insertCard(icbccard);// 把工行卡（icbccard）插入农行的ATM机（abcatm）中
		abcatm.run();// abcatm运行了，接下来执行用户操作
	}
}
