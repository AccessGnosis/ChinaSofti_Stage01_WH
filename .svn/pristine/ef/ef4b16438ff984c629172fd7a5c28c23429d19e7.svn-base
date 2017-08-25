/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: O.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: обнГ1:59:49
*/
package com.chinasofti.eec.day008.homework;

public class O extends Cell {
	Cell[] cells;

	O() {
		this(0, 0);
	}

	O(int row, int col) {
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row + 1, col),
				new Cell(row + 1, col + 1) };
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
