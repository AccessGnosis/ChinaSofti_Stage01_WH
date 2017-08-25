/**
* Describe: 测试类
* Keyword: 
* Hint: 
* Filename: TJTest.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 下午2:05:14
*/
package com.chinasofti.eec.day010.tetris;

public class Test {

	public static void main(String[] args) {
		J j = new J();
		j.printBackground();
		System.out.println();
	}

	public static void printWall(Tetromino tt) {
		Cell[] cellss = tt.cells; // 获取tt型的格子数组，并赋值给cellss
		boolean sh = false; // 开关

		for (int i = 0; i < 20; ++i) {
			for (int j = 0; j < 10; ++j) {
				for (int k = 0; k < cellss.length; ++k) {
					if (i == cellss[k].row && j == cellss[k].col) {
						System.out.print("* ");
						sh = true; // 重定义sh开关属性
						break;
					}
				}
				if (sh) { // 开关判断
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
