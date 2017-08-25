/**
* Describe: 俄罗斯方块——方块类
* Keyword: 
* Hint: 
* Filename: Cell.java
* Copyright 2017-02-10 By Gnosis. Allright reserved.
* Time: 上午11:31:12
*/
package com.chinasofti.eec.day008.homework;

public class Cell {
	static int bgrow = 20;
	static int bgcol = 10;
	int row = 0;
	int col = 0;

	Cell() {
	}

	Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	void moveLeft() {
		if (col - 1 >= 0) {
			col--;
		} else {
			col = 0;
		}
	}

	void moveLeft(int n) {
		if (col - n >= 0) {
			col -= n;
		} else {
			col = 0;
		}
	}

	void moveRight() {
		if (col + 1 <= (bgcol - 1)) {
			col++;
		} else {
			col = bgcol - 1;
		}
	}

	void moveRight(int n) {
		if (col + n <= (bgcol - 1)) {
			col += n;
		} else {
			col = bgcol - 1;
		}
	}

	static void drop(Cell c[]) {

		for (int i = 0; i < c.length; ++i) {

			if (c[c.length - 1].row + 1 <= (bgrow - 1)) {
				c[i].row++;
			} else {
				c[0].row = c[1].row = bgrow - 2;
				c[2].row = c[3].row = bgrow - 1;
			}
		}
	}

	static void printBackgroud(Cell c[]) {
		char block = '-'; // 制作背景的字符
		int k = 0, f = 0;
		for (int i = 0; i < Cell.bgrow; ++i) {
			for (int j = 0; j < Cell.bgcol; ++j) {
				if (c[k].row == i && c[f].col == j) {
					System.out.print("* ");
					if (k == (c.length - 1) || f == (c.length - 1)) {
						continue;
					}
					++k;
					++f;
				} else {
					System.out.print(block + " ");
				}
			}
			System.out.println();
		}
	}

	void printPos() {
		System.out.println("方块在第" + (row + 1) + "行，第" + (col + 1) + "列");
	}
}
