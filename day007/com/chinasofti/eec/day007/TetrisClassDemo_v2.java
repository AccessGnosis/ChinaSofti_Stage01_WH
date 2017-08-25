/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TetrisClassDemo_v2.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: обнГ1:42:44
*/
package com.chinasofti.eec.day007;

public class TetrisClassDemo_v2 {

	public static void main(String[] args) {
		Cell c = new Cell();
		c.col = 2;
		c.row = 3;
		printWall(c);
	}

	private static void printWall(Cell c) {
		for (int i = 1; i <= 20; ++i) {
			for (int j = 1; j <= 10; ++j) {
				if (i == c.row && j == c.col) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}