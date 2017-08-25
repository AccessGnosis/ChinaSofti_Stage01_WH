package com.chinasofti.eec.exam.onboard;

import java.util.Scanner;

public class Di_02 {
	// 编程：有一对兔子，从出生后第三个月起每个月都生一对兔子，
	// 小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		for (int i = 1; i <= month; ++i) {
			System.out.println("第" + i + "个月，兔子的数量是" + (rubbitCount(i) * 2) + "只");
		}
	}

	public static int rubbitCount(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return (rubbitCount(num - 1) + rubbitCount(num - 2));
		}
	}
}
