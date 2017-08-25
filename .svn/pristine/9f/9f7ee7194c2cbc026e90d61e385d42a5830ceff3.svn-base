/**
* Describe: 本案例要求完成 CellGame，用户可以在控制台上操作格子的下落、左移和右移。
*			游戏刚开始，将在界面上显示一个格子，界面效果如图－2上左图中的蓝色圈内所示，
*			用户可以在控制台选择输入各种操作：1表示下落一行，2表示左移一列，3表示右移一列，0表示退出。
*			如果用户录入1，则格子下落一行，并重新打印显示，界面效果如图－2上右图中的蓝色圈内所示：
* Keyword: 
* Hint: 
* Filename: Di_5_CellGame.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 下午7:31:31
*/
package com.chinasofti.eec.day007.homework;

import java.util.Scanner;

public class Di_5_CellGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cell c = new Cell(2, 2);
		int command = 0;

		do {
			System.out.println("1-下落；2-向左；3-向右；0-退出");
			c.printPos();
			c.printBackgroud();
			command = scan.nextInt();

			switch (command) {
			case 1:
				c.drop();
				break;
			case 2:
				c.moveLeft();
				break;
			case 3:
				c.moveRight();
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

}
