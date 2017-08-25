/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: J.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 下午2:25:06
*/
package com.chinasofti.eec.day010.tetris;

public class J extends Tetromino {
	J() {// 无参构造方法
		this(0, 0);
	}

	J(int row, int col) {// 有参构造方法
		cells = new Cell[] { new Cell(row, col + 1), new Cell(row + 1, col + 1),
				new Cell(row + 2, col), new Cell(row + 2, col + 1) };
	}

	@Override
	void printBackground() {
		super.printBackground();// 调用父类中的printBackground()方法
		System.out.println("子类的printBackground()方法被调用了");
	}
}
