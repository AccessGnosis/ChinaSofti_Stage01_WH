/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Z.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: обнГ2:20:06
*/
package com.chinasofti.eec.day009.tetris;

public class Z extends Tetromino{
	Z() {
		this(0, 0);
	}

	Z(int row, int col) {
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row + 1, col + 1),
				new Cell(row + 1, col + 2) };
	}
}
