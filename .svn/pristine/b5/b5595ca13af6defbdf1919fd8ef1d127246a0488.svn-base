/**
* Describe: 俄罗斯方块的T形状的测试类
* Keyword: 
* Hint: 
* Filename: TTest.java
* Copyright 2017-02-10 By Gnosis. Allright reserved.
* Time: 下午2:19:33
*/
package com.chinasofti.eec.day008.tetris;

public class TTest {

	public static void main(String[] args) {
		T t = new T();
		System.out.println("原始坐标");
		t.prinrPos();
		System.out.println("下落一格后的坐标");
		t.drop();
		t.prinrPos();
		System.out.println("右移一格后的坐标");
		t.moveRight();
		t.prinrPos();
		t.printBackground();
		t.prinrPos();
		printWall(t);
	}

	public static void printWall(T tt) {
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