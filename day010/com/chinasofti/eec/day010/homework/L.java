/**
* Describe: 俄罗斯方块中形状 L
* Keyword: 
* Hint: 
* Filename: T.java
* Copyright 2017-02-10 By Gnosis. Allright reserved.
* Time: 下午1:59:10
*/
package com.chinasofti.eec.day010.homework;

public class L extends Tetromino{

	L() {// 无参构造方法
		this(0, 0);
	}

	L(int row, int col) {// 有参构造方法
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row + 1, col + 1),
				new Cell(row + 2, col + 1) };
	}

}
