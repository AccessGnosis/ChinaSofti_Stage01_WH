/**
* Describe: 俄罗斯方块中形状 T
* Keyword: 
* Hint: 
* Filename: T.java
* Copyright 2017-02-10 By Gnosis. Allright reserved.
* Time: 下午1:59:10
*/
package com.chinasofti.eec.day008.homework;

public class T extends Cell {
	Cell[] cells;

	T() {// 无参构造方法
		this(0, 0);
	}

	T(int row, int col) {// 有参构造方法
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row, col + 2),
				new Cell(row + 1, col + 1) };
	}

	void drop() {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].row++;
		}
	}

	void moveLeft() {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].col--;
		}
	}

	void moveLeft(int step) {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].col -= step;
		}
	}

	void moveRight() {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].col++;
		}
	}

	void moveRight(int step) {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].col += step;
		}
	}

	void prinrPos() {
		for (int i = 0; i < this.cells.length; ++i) {
			this.cells[i].printPos();
		}
	}

	void printBackground() {
		char bg = '-';
		int k = 0;
		for (int i = 0; i < bgrow; ++i) {
			for (int j = 0; j < bgcol; ++j) {
				if (k < cells.length && i == cells[k].row && j == cells[k].col) {
					System.out.print("* ");
					++k;
				} else {
					System.out.print(bg + " ");
				}
			}
			System.out.println();
		}
	}
}
