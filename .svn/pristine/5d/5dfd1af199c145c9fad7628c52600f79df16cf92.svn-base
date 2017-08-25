package com.chinasofti.eec.task;

public class MultiplicationTable_ByFor {

	public static void main(String[] args) {
		int len = 9;
		for (int i = 1; i <= len; ++i) {
			for (int j = 1; j <= len; ++j) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
				if (i == j) {
					j = 1;
					break;
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		for (int num = 1; num <= 9; ++num) { // 外层控制行
			for (int i = 1; i <= num; ++i) { // 内层控制列
				System.out.print(num + "*" + i + "=" + (i * num) + "\t");
			}
			System.out.println();
		}
	}

}
