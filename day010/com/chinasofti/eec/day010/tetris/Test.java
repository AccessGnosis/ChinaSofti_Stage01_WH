/**
* Describe: ������
* Keyword: 
* Hint: 
* Filename: TJTest.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: ����2:05:14
*/
package com.chinasofti.eec.day010.tetris;

public class Test {

	public static void main(String[] args) {
		J j = new J();
		j.printBackground();
		System.out.println();
	}

	public static void printWall(Tetromino tt) {
		Cell[] cellss = tt.cells; // ��ȡtt�͵ĸ������飬����ֵ��cellss
		boolean sh = false; // ����

		for (int i = 0; i < 20; ++i) {
			for (int j = 0; j < 10; ++j) {
				for (int k = 0; k < cellss.length; ++k) {
					if (i == cellss[k].row && j == cellss[k].col) {
						System.out.print("* ");
						sh = true; // �ض���sh��������
						break;
					}
				}
				if (sh) { // �����ж�
					sh = false;
					continue;
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
