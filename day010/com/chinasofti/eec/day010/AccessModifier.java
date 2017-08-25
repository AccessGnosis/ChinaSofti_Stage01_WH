/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AccessModifier.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 上午11:39:01
*/
package com.chinasofti.eec.day010;

public class AccessModifier {// 验证本类访问
	public int a;
	protected int b;
	int c;
	private int d;

	void show() {
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
}

class Gooo { // 验证private，本类
	void show() {
		AccessModifier o = new AccessModifier();
		o.a = 1;
		o.b = 2;
		o.c = 3;
		// o.d = 4; //private必须本类中访问

	}
}