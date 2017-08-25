/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: I.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: обнГ2:22:16
*/
package com.chinasofti.eec.day009.tetris;

public class I extends Tetromino {
	I() {
		this(0, 0);
	}

	I(int row, int col) {
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row, col + 2),
				new Cell(row, col + 3) };
	}
}
