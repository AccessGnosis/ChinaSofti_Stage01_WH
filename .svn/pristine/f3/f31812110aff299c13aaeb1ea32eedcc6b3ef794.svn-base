package com.chinasofti.eec.day003;

public class BreakContinueDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; ++i) {
			sum += i;
			System.out.println(sum);
			if (sum >= 40) {
				break; // 跳出当前循环
			}
			System.out.println("看我走不");
		}
		System.out.println("over");

		// 计算1--100之内个数不为3的数的和
		sum = 0;
		for (int i = 1; i <= 100; ++i) {
			if (i % 10 == 3) {
				System.out.print(i + " ");
				continue;
			}
			if (i % 50 == 0) {
				System.out.println("");
			}
			sum += i;
		}
		System.out.println("sum = " + sum);
	}

}
