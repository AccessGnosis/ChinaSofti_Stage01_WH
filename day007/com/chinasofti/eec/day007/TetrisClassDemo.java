/**
* Describe: ����˹�����ඨ��ʵ��
* Keyword: ����˹���飻��
* Hint: 
* Filename: TetrisClassDemo.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: ����11:22:46
*/
package com.chinasofti.eec.day007;

public class TetrisClassDemo {

	public static void main(String[] args) {
		Cell bg = new Cell();
		System.out.println("�����ڵ�" + (bg.row + 1) + "�У���" + (bg.col + 1) + "��");
		bg.printBackgroud();

		bg.moveRight(5);
		bg.drop();
		System.out.println("�����ڵ�" + (bg.row + 1) + "�У���" + (bg.col + 1) + "��");
		bg.printBackgroud();

		bg.moveRight(20);
		for (int i = 0; i < 100; ++i) {
			bg.drop();
		}
		System.out.println("�����ڵ�" + (bg.row + 1) + "�У���" + (bg.col + 1) + "��");
		bg.printBackgroud();

	}

}

class Cell {
	int bgrow = 15;
	int bgcol = 8;
	int row = 0;
	int col = 0;

	void moveLeft(int n) {
		if (row - n >= 0) {
			col -= n;
		} else {
			col = 0;
		}
	}

	void drop() {
		if (row <= bgrow) {
			row++;
		} else {
			row = bgrow - 1;
		}
	}

	void moveRight(int n) {
		if (row + n <= bgcol) {
			col += n;
		} else {
			col = bgcol - 1;
		}
	}

	public void printBackgroud() {
		char block = '-';
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
}
