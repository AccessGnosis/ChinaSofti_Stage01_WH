/**
* Describe: 俄罗斯方块——Extends示例
* Keyword: 
* Hint: 
* Filename: ExtendsDemo.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 上午11:27:47
*/
package com.chinasofti.eec.day010.homework;

import java.util.Scanner;

public class TetrisDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		T t = new T();
		int command = 0;

		do {
			System.out.println("1-下落；2-向左；3-向右；0-退出");
			printBackgroud(t);
			command = scan.nextInt();

			switch (command) {
			case 1:
				t.drop();
				break;
			case 2:
				t.moveLeft();
				break;
			case 3:
				t.moveRight();
				break;
			case 0:
				System.out.println("游戏已结束");
				break;
			default:
				System.out.println("输入指令有误，请重新输入");
				break;
			}

		} while (command != 0);
	}

	public static void printBackgroud(Tetromino tt) {
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