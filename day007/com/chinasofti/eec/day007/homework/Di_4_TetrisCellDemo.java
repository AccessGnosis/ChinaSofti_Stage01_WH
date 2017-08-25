/**
* Describe: 本案例需要实现格子的右移功能，即需要为 Cell类定义右移的方法。该方法需要使用重载来分别实现两种功能：
*			功能1：调用右移方法，不需要传入任何参数，则格子向右移动一列，如图－1上中间的图形所示；
*			功能2：调用右移方法，并传入需要移动的列数，则格子将向右移动相应的列数，如图－1上右边的图形所示。
*			本案例首先需要打印出游戏所在的平面（宽10格，高20格），用“－”号表示平面上的每个单元；然后假设某格子的坐标为（15，3），
*			即，行号为15，列号为3，需要使用“*”号打印显示该格子，如图－1中左图中的蓝色圈内所示。先调用不带参数的右移方法，
*			则格子右移一列，如图－1上中间图形上蓝色圈内所示；然后调用带参数的右移方法使得格子向右移动 4 列，并重新打印效果
* Keyword: 
* Hint: 
* Filename: Di_4_TetrisCellDemo.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 下午7:12:46
*/
package com.chinasofti.eec.day007.homework;

import java.util.Scanner;

public class Di_4_TetrisCellDemo {

	public static void main(String[] args) {
		Cell c = new Cell(14, 2);

		System.out.println("Cell的初始位置：");
		c.printPos();
		c.printBackgroud();

		new Scanner(System.in).nextLine();
		printVoidRow(3);

		System.out.println("Cell右移一位的位置：");
		c.moveRight();
		c.printPos();
		c.printBackgroud();

		new Scanner(System.in).nextLine();
		printVoidRow(3);

		System.out.println("Cell右移四位的位置：");
		c.moveRight(4);
		c.printPos();
		c.printBackgroud();
	}

	public static void printVoidRow(int n) {
		for (int i = 0; i < n; ++i) {
			System.out.println();
		}
	}

}

class Cell {
	int bgrow = 20;
	int bgcol = 10;
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

	void drop() {
		if (row + 1 <= (bgrow - 1)) {
			row++;
		} else {
			row = bgrow - 1;
		}
	}

	void printBackgroud() {
		char block = '-'; // 制作背景的字符
		for (int i = 0; i < bgrow; ++i) {
			for (int j = 0; j < bgcol; ++j) {
				if (row == i && col == j) {
					System.out.print("* ");
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
