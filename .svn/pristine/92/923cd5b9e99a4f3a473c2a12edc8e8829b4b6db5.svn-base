/**
* Describe: 构建四格图形父类
* Keyword: 
* Hint: 
* Filename: Tetromino.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 下午2:09:46
*/
package com.chinasofti.eec.day009.tetris;

public class Tetromino {
	Cell[] cells;
	int bgrow = 18;
	int bgcol = 10;

	public Tetromino() {
		// cells = new Cell[4];// 成员变量初始化
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
