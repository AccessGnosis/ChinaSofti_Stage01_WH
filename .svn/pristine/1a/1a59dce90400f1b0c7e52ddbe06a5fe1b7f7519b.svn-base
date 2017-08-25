/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: J.java
* Copyright 2017-02-10 By Gnosis. Allright reserved.
* Time: обнГ2:30:43
*/
package com.chinasofti.eec.day008.homework;

public class J extends Cell {
	Cell[] cells;

	J() {
		this(0, 0);
	}

	J(int row, int col) {
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row + 1, col + 1),
				new Cell(row + 2, col + 1) };
	}

	void moveLeft() {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].col--;
		}
	}

	void moveRight() {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].col++;
		}
	}

	void drop() {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].row++;
		}
	}

	void printGraphic() {
		for (int i = 0; i < cells.length; ++i) {
			cells[i].printPos();
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
