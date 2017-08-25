/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Tetris.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午1:55:34
*/
package com.chinasofti.eec.day008.homework;

public class Tetris {

	public static void main(String[] args) {
		J j = new J(0, 0);
		T t = new T(4, 0);
		O o = new O(0, 4);
		
		System.out.println("J型：");
		j.printBackground();
		System.out.println("T型");
		t.printBackground();
		System.out.println("O型");
		o.printBackground();
	}

}
