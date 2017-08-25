package com.chinasofti.eec.wvt.task;

import java.util.Scanner;

public class TheStoryOfSheepsVillage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Computer cp1 = new Computer();
		Person psn1 = new Person();

		System.out.println("---------------欢迎进入羊村游戏世界---------------");
		System.out.println();
		System.out.println();
		System.out.println("               ****************");
		System.out.println("               **   游戏开始   **");
		System.out.println("               ****************");
		System.out.println();
		System.out.println("出拳规则：1.石头；2.剪刀；3.布");

		while (true) {
			// 设置玩家和电脑名字
			psn1.setName();
			cp1.setName();
			System.out.println();
			System.out.print("开始游戏吗？(y/n)：");
			String gameBegin = scan.next();

			if (gameBegin.equals("y") || gameBegin.equals("Y")) {
				break;
			} else {
				System.out.println("游戏重新开始。请重新选择角色：");
			}
		}
		System.out.println();

		// 初始化得分
		int count = 0;
		int psnWin = 0;
		int cpWin = 0;

		while (true) {
			System.out.println("---------------------------------------------");

			// 玩家出拳
			psn1.setStat();
			// 电脑出拳
			cp1.setStat();

			System.out.println();
			System.out.println(psn1.getName() + "(您)出拳：" + psn1.showStatToString());
			System.out.println(cp1.getName() + "(电脑)出拳：" + cp1.showStatToString());

			// 判断猜拳结果
			if (psn1.getStat() == 1 && cp1.getStat() == 2) {
				psnWin++;
				psn1.setScore(psnWin);
				count++;
				System.out.println("运气真好，你赢了");
			} else if (psn1.getStat() == 1 && cp1.getStat() == 3) {
				cpWin++;
				cp1.setScore(cpWin);
				count++;
				System.out.println("不好意思，你输了");
			} else if (psn1.getStat() == 2 && cp1.getStat() == 1) {
				cpWin++;
				cp1.setScore(cpWin);
				count++;
				System.out.println("不好意思，你输了");
			} else if (psn1.getStat() == 2 && cp1.getStat() == 3) {
				psnWin++;
				psn1.setScore(psnWin);
				count++;
				System.out.println("运气真好，你赢了");
			} else if (psn1.getStat() == 3 && cp1.getStat() == 1) {
				psnWin++;
				psn1.setScore(psnWin);
				count++;
				System.out.println("运气真好，你赢了");
			} else if (psn1.getStat() == 3 && cp1.getStat() == 2) {
				cpWin++;
				cp1.setScore(cpWin);
				count++;
				System.out.println("不好意思，你输了");
			} else if (psn1.getStat() == cp1.getStat()) {
				count++;
				System.out.println("出拳相同，平局");
			}

			System.out.print("是否开始下一轮？(y/n)：");
			String continueNext = scan.next();
			if (continueNext.equals("n") || continueNext.equals("N")) {
				System.out.println();
				System.out.println("---------------------------------------------");
				System.out.println("--------------------游戏结束-------------------");
				System.out.println("              " + psn1.getName() + "  V.S.  " + cp1.getName());
				System.out.println();
				System.out.println("次数：" + count);
				System.out.println("平局：" + (count - psn1.getScore() - cp1.getScore()));
				System.out.println(psn1.getName() + "(您)得分：" + psn1.getScore());
				System.out.println(cp1.getName() + "(电脑)得分：" + cp1.getScore());
				System.out.println("---------------------------------------------");
				System.out.println("---------------------------------------------");
				break;
			}
		}
	}
}
