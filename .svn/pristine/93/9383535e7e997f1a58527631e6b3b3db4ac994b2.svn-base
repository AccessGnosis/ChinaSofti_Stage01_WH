package com.chinasofti.eec.task;

import java.util.Scanner;

public class LoopGuessGame_v3 {
	// main()方法
	public static void main(String[] args) {
		int count = 0; // 存储的是猜错的次数
		Scanner scan = new Scanner(System.in);
		char[] chs = generatRandomChar_v2();
		System.out.print("我悄悄藏起来的字符：");
		for (int i = 0; i < chs.length; ++i) {
			System.out.print(chs[i]);
		}
		System.out.println();
		while (true) {
			System.out.print("您猜吧：");
			String str = scan.next().toUpperCase(); // 从键盘获取数据，并转化为大写
			if ("EXIT".equals(str)) {
				System.out.println("游戏结束");
				break;
			}
			char[] input = str.toCharArray(); // 把字符串转为字符数组
			int[] result = check(chs, input); // 对比chs数组和input数组

			if (result[0] == chs.length) { // 猜对了，位置对，意味着全猜对了
				int score = chs.length * 100 - count * 10;
				System.out.println("恭喜您，猜对了，您的得分是：" + score + "分");
				break; // 跳出当前循环
			} else { // 猜错了
				count++; // 错误次数累加，每次加1
				System.out.println("字符对：" + result[1] + "个，位置对" + result[0] + "个");
			}
		}
	}

	// 随机生成一组字符数组
	public static char[] generatRandomChar_v2() {
		char[] chs = new char[5];
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		// 声明一个和letters一一对应的boolean类型的开关数组
		boolean[] flag = new boolean[letters.length];

		for (int i = 0; i < chs.length; ++i) {// 遍历chs数组
			int index; // letters数组中元素的下标
			do {
				index = (int) (Math.random() * letters.length); // letters数组的随机下标
			} while (flag[index] == true); // flag[index]为true代码生成过对应的字符，则重新生成下标

			chs[i] = letters[index]; // 取出letters中的元素赋值给chs中的每一个元素
			flag[index] = true; // true代表已经生成过
		}

		return chs;
	}

	public static char[] generatRandomChar_v1() {
		char[] chs = new char[5];
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] flag = new boolean[letters.length];

		for (int i = 0; i < chs.length; ++i) { // 遍历chs数组
			int index = (int) (Math.random() * letters.length); // letters数组的随机下标
			if (flag[index] == false) {
				chs[i] = letters[index];
				flag[index] = true;
			} else {
				--i;
			}
		}

		return chs;
	}

	public static char[] generatRandomCharMaybeRepeat() {
		char[] chs = new char[5];
		int uLetterBtm = (int) 'A';
		int uLetterUp = (int) 'Z';
		int i = 0;

		while (true) {
			int rdm = (int) (Math.random() * (uLetterUp - uLetterBtm) + uLetterBtm);
			if (rdm >= uLetterBtm && rdm <= uLetterUp) {
				chs[i] = (char) rdm;
				++i;
			}
			if (i == chs.length) {
				break;
			}
		}
		return chs;
	}

	// 对比随机生成的字符数组和用户输入的字符数组
	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2]; // 比较的结果
		// result[0]存放位置对
		// result[1]存放字符相同的个数
		// 嵌套循环：外层走一次，内层走所有次
		for (int i = 0; i < chs.length; ++i) { // chs数组，外层控制次数
			for (int j = 0; j < input.length; ++j) { // input数组，内层比的每轮次数
				if (chs[i] == input[j]) { // 字符相同的情况
					result[1]++; // 字符对，个数增1
					if (i == j) { // 位置相同，位置是在字符相同的基础上进行比较
						result[0]++; // 位置对，个数增1
					}
					break; // 因为字符是不重复的，所以字符对后，直接退出，不再进行比较
				}
			}
		}
		return result;
	}
}