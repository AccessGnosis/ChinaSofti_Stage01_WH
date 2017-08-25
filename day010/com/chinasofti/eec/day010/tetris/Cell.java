/**
* Describe: 由对象抽出的一个Cell格子类
* Keyword: 
* Hint: 
* Filename: Cell.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 下午1:55:50
*/
package com.chinasofti.eec.day010.tetris;

public class Cell {
	int row, col;

	public Cell() {
		this(0, 0);
	}

	public Cell(int n) {
		this(n, n);
	}

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	void drop() {
		row++;
	}

	void moveLeft() {
		col--;
	}

	void moveRigth() {
		col++;
	}

	String getCell() {
		return "(" + row + ", " + col + ")";
	}
}
