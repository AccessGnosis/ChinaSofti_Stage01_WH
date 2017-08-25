/**
* Describe: 测试类
* Keyword: 
* Hint: 
* Filename: TJTest.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 下午2:05:14
*/
package com.chinasofti.eec.day009.tetris;

public class Test {

	public static void main(String[] args) {
		T t = new T();
		t.printBackground();
		System.out.println();
		O o = new O();
		o.printBackground();
		System.out.println();
		L l = new L();
		l.printBackground();
		System.out.println();
		S s = new S();
		s.printBackground();
		System.out.println();
		I i = new I();
		i.printBackground();
		System.out.println();
		Z z = new Z();
		z.printBackground();
		System.out.println();
		J j = new J();
		j.printBackground();
		System.out.println();

		//父类类型子类对象示例
		Tetromino t1 = new T(); // 向上造型
		Tetromino j1 = new J();
		Tetromino o1 = new O();

		printWall(t1);
		System.out.println();
		printWall(j1);
		System.out.println();
		printWall(o1);
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
