package com.chinasofti.eec.exam.onboard;

public class Di_02_v2 {
	public static void main(String[] args) {
		// 第i个月 本月新出生的兔子 上个月的总兔子 共x对
		// 1 1
		// 1 2
		// 3 1 1 2
		// 4 1 2 3
		// 5 2 3 5
		// 6 3 5 8
		// 7 5 8 13
		System.out.println("第1个月的兔子总数是：1");
		System.out.println("第2个月的兔子总数是：1");
		int f1 = 1, f2 = 1, m = 20, temp;
		for (int i = 3; i <= m; ++i) {
			temp = f2; // 把上个月的总兔子赋给temp
			f2 = f1 + f2;
			f1 = temp; // 下一个月的新兔子，等于本月兔子中的
			System.out.println("第" + i + "个月的兔子总数是：" + f2);
		}
	}
}
