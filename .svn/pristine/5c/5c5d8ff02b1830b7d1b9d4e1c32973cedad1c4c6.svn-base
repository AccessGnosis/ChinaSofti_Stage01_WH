/**
* Describe: 执行类——农行的卡在农行的ATM上操作
* Keyword: 
* Hint: 
* Filename: ExecClass_ABCCardOnABCATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午5:30:13
*/
package com.chinasofi.eec.day012.homework;

public class ExecClass_ABCCardOnABCATM {
	public static void main(String[] args) {
		Unionpay abccard = new ABCCard(100, "123"); // 用户开卡，开卡时存100元，密码是123
		ATM abcatm = new ABCATM(); // 实例化农行的ATM机，向上造型为ATM机
		abcatm.insertCard(abccard); // 把农行卡（abccard）插入农行的ATM机（abcatm）中
		abcatm.run(); // abcatm运行了，接下来执行用户操作
	}
}
