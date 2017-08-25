/**
* Describe: 空指针异常
* Keyword: NullPointerException
* Hint: 
* Filename: NullPointerException.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 下午2:38:24
*/
package com.chinasofti.eec.day007;

public class NullPointerException {

	public static void main(String[] args) {
		Cell c1 = new Cell();
		Cell c2 = new Cell();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		c2 = c1;
		System.out.println(c1 + " —— " + c1.hashCode());
		System.out.println(c2 + " —— " + c2.hashCode());
		c1.row = 5;
		c2.row = 9;
		Cell c = new Cell();
		c.row = 2;
		System.out.println(c.row);
		c = null;
		
		c1 = null;
		System.out.println(c2.row);	//这表示了是c1所指向的链接断开，并不是对象内容的改变

		try {
			System.out.println(c.row);
		} catch (Exception e) {
			System.out.println("空指针异常");
		}
	}

}
