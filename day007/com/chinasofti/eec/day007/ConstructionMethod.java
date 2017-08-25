/**
* Describe: 构造方法
* Keyword: 
* Hint: 有无参数构造方法
* Filename: ConstructionMethod.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 下午4:46:16
*/
package com.chinasofti.eec.day007;

public class ConstructionMethod {

	public static void main(String[] args) {
		Block b = new Block(); // 调无参构造方法 //如果不写，系统自动提供一个无参构造方法
		// 但是如果指定了有参构造方法，必须自己再定义一个无参构造方法，否则会报错
		Block c = new Block(2); // 调一个参数的构造
		printWall(c);
		System.out.println();
		Block d = new Block(5, 8); // 调两个参数的构造
		printWall(d);
		System.out.println();
		d.moveLeft(3);
		d.drop();
		printWall(d);
	}

	public static void printWall(Block c) {
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

class Person {
	public Person() {
		// 无参构造方法
		// 构造方法体
	}

	public Person(String name) {
		// 有参构造方法
	}

	public Person(String name, int age) {
		// 多参构造方法
	}
}

class Block {
	int row;
	int col;

	public Block() {
		this(2);
		this.row = 2;
		this.col = 5;
	}

	public Block(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public Block(int n) {
		this(0, 0);	//当前对象构造函数
		this.row = n;
		this.col = n;
	}

	void drop() { // 每次下落一格
		row++;
	}

	void drop(int n) { // 每次下落n格
		row += n;
	}

	void moveLeft() {
		col--;
	}

	void moveLeft(int n) {
		col -= n;
	}

	void moveRight() {
		col++;
	}

	void moveRight(int n) {
		col += n;
	}

	String getBlockInfo() {
		return row + "," + col;
	}
}