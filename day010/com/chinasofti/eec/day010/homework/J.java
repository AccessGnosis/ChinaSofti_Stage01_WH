/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: J.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: ����2:25:06
*/
package com.chinasofti.eec.day010.homework;

public class J extends Tetromino {
	J() {// �޲ι��췽��
		this(0, 0);
	}

	J(int row, int col) {// �вι��췽��
		cells = new Cell[] { new Cell(row, col + 1), new Cell(row + 1, col + 1), new Cell(row + 2, col),
				new Cell(row + 2, col + 1) };
	}
}
