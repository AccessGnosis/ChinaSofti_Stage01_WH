/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: O.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: обнГ2:16:33
*/
package com.chinasofti.eec.day009.tetris;

public class O extends Tetromino {
	O() {
		this(0, 0);
	}

	O(int row, int col) {
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row + 1, col),
				new Cell(row + 1, col + 1) };
	}
}
