/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: S.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: обнГ2:26:52
*/
package com.chinasofti.eec.day010.homework;

public class S extends Tetromino{
	S() {
		this(0, 0);
	}

	S(int row, int col) {
		cells = new Cell[] { new Cell(row, col + 1), new Cell(row, col + 2), new Cell(row + 1, col),
				new Cell(row + 1, col + 1) };
	}
}
