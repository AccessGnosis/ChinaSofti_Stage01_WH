/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_26.java
* Copyright 2017-02-17 By Gnosis. Allright reserved.
* Time: обнГ1:46:28
*/
package com.chinasofti.eec.day013.exam;

public class Di_26 {
	String name = "Tom";

	public Di_26(String name) {
		name = name;
	}
	public static void main(String[] args) {
		Di_26 t = new Di_26("Jack");
		System.out.println(t.name);
	}
}
