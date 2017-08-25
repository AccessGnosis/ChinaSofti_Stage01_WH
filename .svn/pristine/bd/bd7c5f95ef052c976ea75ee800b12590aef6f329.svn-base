package com.chinasofti.eec.wvt.task;

import java.util.Scanner;

public class Computer {
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
			System.out.print("ÇëÑ¡Ôñ¶ÔÊÖ½ÇÉ«£º(1.Ï²ÑòÑò  2.ÂıÑòÑò  3.ÀÁÑòÑò)£º");
			name = scan.nextInt();
			if (name < 1 || name > 3) {
				System.out.println("ÄúµÄÊäÈëÓĞÎó£¬ÇëÖØĞÂÊäÈë");
			} else {
				break;
			}
		}

		switch (name) {
		case 1:
			this.name = "Ï²ÑóÑó";
			break;
		case 2:
			this.name = "ÂıÑóÑó";
			break;
		case 3:
			this.name = "ÀÁÑóÑó";
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
		this.stat = (int) (Math.random() * 3 + 1);
	}

	public String showStatToString() {
		String result = null;

		switch (stat) {
		case 1:
			result = "Ê¯Í·";
			break;
		case 2:
			result = "¼ôµ¶";
			break;
		case 3:
			result = "²¼";
			break;
		}
		return result;
	}
}
