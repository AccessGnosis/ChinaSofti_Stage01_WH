package com.chinasofti.eec.wvt.task;

import java.util.Scanner;

public class Person {
	private String name;
	private int score;
	private int stat;

	public String getName() {
		return name;
	}

	public void setName() {
		int name = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("请选择你的角色：(1.沸羊羊  2.暖羊羊  3.美羊羊)：");
			name = scan.nextInt();
			if (name < 1 || name > 3) {
				System.out.println("您的输入有误，请重新输入");
			} else {
				break;
			}
		}

		switch (name) {
		case 1:
			this.name = "沸洋洋";
			break;
		case 2:
			this.name = "暖洋洋";
			break;
		case 3:
			this.name = "美洋洋";
			break;
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getStat() {
		return stat;
	}

	public void setStat() {
		Scanner scan = new Scanner(System.in);
		int stat = 0;
		
		while (true) {
			System.out.print("请出拳：1.石头  2.剪刀  3.布：");
			stat = scan.nextInt();
			if (stat < 1 || stat > 3) {
				System.out.println("您的输入有误，请重新输入");
			} else {
				break;
			}
		}
		this.stat = stat;
	}

	public String showStatToString() {
		String result = null;

		switch (stat) {
		case 1:
			result = "石头";
			break;
		case 2:
			result = "剪刀";
			break;
		case 3:
			result = "布";
			break;
		}
		return result;
	}
}
