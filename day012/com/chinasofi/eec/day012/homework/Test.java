/**
* Describe: 最初的测试类
* Keyword: 
* Hint: 一张卡在通用ATM机和农行的ATM机上的测试
* Filename: Test.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午4:40:09
*/
package com.chinasofi.eec.day012.homework;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Unionpay icard = new ICBCCard(1000, "123"); // 开卡，存1000元
		ATM atm = new ATM();
		atm.insertCard(icard);
		atm.run();
		
		ABCATM abcatm = new ABCATM();
		abcatm.insertCard(icard);
		abcatm.run();
	}

}
