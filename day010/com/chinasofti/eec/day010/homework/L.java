/**
* Describe: ����˹��������״ L
* Keyword: 
* Hint: 
* Filename: T.java
* Copyright 2017-02-10 By Gnosis. Allright reserved.
* Time: ����1:59:10
*/
package com.chinasofti.eec.day010.homework;

public class L extends Tetromino{

	L() {// �޲ι��췽��
		this(0, 0);
	}

	L(int row, int col) {// �вι��췽��
		cells = new Cell[] { new Cell(row, col), new Cell(row, col + 1), new Cell(row + 1, col + 1),
				new Cell(row + 2, col + 1) };
	}

}
