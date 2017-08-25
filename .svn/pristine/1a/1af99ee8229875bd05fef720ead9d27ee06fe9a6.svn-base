/**
* Describe: ¶íÂÞË¹·½¿é»æÍ¼
* Keyword: 
* Hint: 
* Filename: TetrisGameGraphic.java
* Copyright 2017-02-10 By Gnosis. Allright reserved.
* Time: ÏÂÎç12:13:15
*/
package com.chinasofti.eec.day008;

import java.util.Scanner;

public class TetrisGameGraphic {

	public static void main(String[] args) {
		Cell[] rectangle = new Cell[] { new Cell(0, 0), new Cell(0, 1),
				new Cell(1, 0), new Cell(1, 1) };
		Cell.printBackgroud(rectangle);
		System.out.println();
		for (int i = 0; i < 20; ++i) {
			new Scanner(System.in).nextLine();
			Cell.drop(rectangle);
			Cell.printBackgroud(rectangle);
		}
		Cell[] rectangle1 = new Cell[] { new Cell(0, 1), new Cell(1, 0),
				new Cell(1, 1), new Cell(1, 2) };
		System.out.println();
		Cell.printBackgroud(rectangle1);
		Cell.drop(rectangle1);
		System.out.println();
		Cell.printBackgroud(rectangle1);
	}

}
