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
			System.out.print("��ѡ����ֽ�ɫ��(1.ϲ����  2.������  3.������)��");
			name = scan.nextInt();
			if (name < 1 || name > 3) {
				System.out.println("����������������������");
			} else {
				break;
			}
		}

		switch (name) {
		case 1:
			this.name = "ϲ����";
			break;
		case 2:
			this.name = "������";
			break;
		case 3:
			this.name = "������";
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
			result = "ʯͷ";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;
		}
		return result;
	}
}
