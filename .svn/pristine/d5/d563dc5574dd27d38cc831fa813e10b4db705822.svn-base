/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AccessModifier.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 上午11:37:22
*/
package com.chinasofti.eec.day010.amdemo;

public class AccessModifier {	//验证不同包类
	void show() {
		com.chinasofti.eec.day010.AccessModifier o = new com.chinasofti.eec.day010.AccessModifier();
		o.a = 1;
		// o.b = 2;//本类 子类 同包类
		// o.c = 3;//本类 同包类
		// o.d = 4;//本类
	}
}

class Ioo extends com.chinasofti.eec.day010.AccessModifier {
	void show() {
		a = 1;
		b = 2;
		// c = 3; //本类 同包类
		// d = 4; //本类
	}
}