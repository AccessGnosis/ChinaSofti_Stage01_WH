/**
* Describe: ��������Ҫʵ�ָ��ӵ����ƹ��ܣ�����ҪΪ Cell�ඨ�����Ƶķ������÷�����Ҫʹ���������ֱ�ʵ�����ֹ��ܣ�
*			����1���������Ʒ���������Ҫ�����κβ���������������ƶ�һ�У���ͼ��1���м��ͼ����ʾ��
*			����2���������Ʒ�������������Ҫ�ƶ�������������ӽ������ƶ���Ӧ����������ͼ��1���ұߵ�ͼ����ʾ��
*			������������Ҫ��ӡ����Ϸ���ڵ�ƽ�棨��10�񣬸�20�񣩣��á������ű�ʾƽ���ϵ�ÿ����Ԫ��Ȼ�����ĳ���ӵ�����Ϊ��15��3����
*			�����к�Ϊ15���к�Ϊ3����Ҫʹ�á�*���Ŵ�ӡ��ʾ�ø��ӣ���ͼ��1����ͼ�е���ɫȦ����ʾ���ȵ��ò������������Ʒ�����
*			���������һ�У���ͼ��1���м�ͼ������ɫȦ����ʾ��Ȼ����ô����������Ʒ���ʹ�ø��������ƶ� 4 �У������´�ӡЧ��
* Keyword: 
* Hint: 
* Filename: Di_4_TetrisCellDemo.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: ����7:12:46
*/
package com.chinasofti.eec.day007.homework;

import java.util.Scanner;

public class Di_4_TetrisCellDemo {

	public static void main(String[] args) {
		Cell c = new Cell(14, 2);

		System.out.println("Cell�ĳ�ʼλ�ã�");
		c.printPos();
		c.printBackgroud();

		new Scanner(System.in).nextLine();
		printVoidRow(3);

		System.out.println("Cell����һλ��λ�ã�");
		c.moveRight();
		c.printPos();
		c.printBackgroud();

		new Scanner(System.in).nextLine();
		printVoidRow(3);

		System.out.println("Cell������λ��λ�ã�");
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
		char block = '-'; // �����������ַ�
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
		System.out.println("�����ڵ�" + (row + 1) + "�У���" + (col + 1) + "��");
	}
}
