/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_01.java
* Copyright 2017-02-17 By Gnosis. Allright reserved.
* Time: обнГ1:25:53
*/
package com.chinasofti.eec.day013.exam;

public class Di_01 extends A{
	public void info() {
		System.out.println("B info");
	}
	public static void main(String[] args) {
		Di_01 b = new Di_01();
		A a = b;
		a.info();
	}
}

class A {
	public void info() {
		System.out.println("A info");
	}
}