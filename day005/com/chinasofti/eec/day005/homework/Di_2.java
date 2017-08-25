package com.chinasofti.eec.day005.homework;

import java.util.Scanner;

public class Di_2 {

	public static void main(String[] args) {
		System.out.println("欢迎尝试猜字符游戏");
		Scanner scan = new Scanner(System.in);
		int score = 500;
		int count = 0;

		while (true) {
			System.out.println("请输入您要游戏的等级：");
			System.out.println("1-普通 2-困难 3-噩梦 其他-自定义难度");
			if (count != 0) {
				System.out.println("您选择了重新开始，得分已扣除。现在分数" + (score - count * 10));
			}
			int scanf = scan.nextInt();
			int level = judgeLevel(scanf);
			char[] chs = genRandomChar(level);

			System.out.print("藏起来的字符是：");
			showArray(chs);
			System.out.println();

			while (true) {
				System.out.println("请输入您猜的字母序列(exit-退出 gup-重新选择难度)");
				String str = scan.next().toUpperCase();
				char[] input = str.toCharArray();

				int[] result = judgeCommonAndPos(input, chs);
				if (str.equals("EXIT")) {
					System.out.println("游戏结束，欢迎再来挑战");
					System.exit(-1);
				}
				if (str.equals("GUP")) {
					break;
				}
				if (result[0] == level && result[1] == level) {
					System.out.println("恭喜您，正解！");
					System.out.println("您的得分是" + (score - count * 10));
					System.exit(-1);
				} else {
					count++;
					System.out.println("位置猜对了" + result[0] + "个，字符猜对了" + result[1] + "个");
				}
			}
		}
	}

	// 判断选择等级
	public static int judgeLevel(int scanf) {
		int level;
		switch (scanf) {
		case 1:
			level = 5;
			break;
		case 2:
			level = 7;
			break;
		case 3:
			level = 10;
			break;
		default:
			level = scanf;
			break;
		}
		return level;
	}

	// 随机生成字符数组
	public static char[] genRandomChar(int num) {
		char[] chs = new char[num];
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] flag = new boolean[letters.length];

		for (int i = 0; i < chs.length; ++i) {
			int index = (int) (Math.random() * letters.length);
			if (flag[index] == false) {
				chs[i] = letters[index];
				flag[index] = true;
			} else {
				--i;
			}
		}

		return chs;
	}

	// 比较传进来的两个字符数组字符相等和位置相等的数量
	public static int[] judgeCommonAndPos(char[] input, char[] chs) {
		int[] result = new int[] { 0, 0 }; // result[0]代表位置正确 result[1]代表字符正确

		for (int i = 0; i < chs.length; ++i) {
			for (int j = 0; j < input.length; ++j) {
				if (chs[i] == input[j]) {
					result[1]++;
					if (i == j) {
						result[0]++;
					}
				}
			}
		}

		return result;
	}

	// 显示字符数组，测试用
	public static void showArray(char[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
	}
}
