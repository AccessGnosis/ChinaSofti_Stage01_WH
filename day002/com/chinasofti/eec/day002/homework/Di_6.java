package com.chinasofti.eec.day002.homework;

import java.util.Scanner;

public class Di_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的工资：");
		double earnMoney = scan.nextDouble();
		double tax = Tax(earnMoney);
		System.out.println("您应交税：" + tax + "元");
	}

	public static double Tax(double earnMoney) {
		earnMoney -= 3500;
		if (earnMoney <= 0) {
			System.out.println("恭喜您，您不用交税");
		} else if (earnMoney <= 1500) {
			earnMoney *= 0.03;
		} else if (earnMoney <= 4500) {
			earnMoney *= 0.1;
			earnMoney -= 105;
		} else if (earnMoney <= 9000) {
			earnMoney *= 0.2;
			earnMoney -= 555;
		} else if (earnMoney <= 35000) {
			earnMoney *= 0.25;
			earnMoney -= 1005;
		} else if (earnMoney <= 55000) {
			earnMoney *= 0.30;
			earnMoney -= 2755;
		} else if (earnMoney <= 80000) {
			earnMoney *= 0.35;
			earnMoney -= 5505;
		} else {
			earnMoney *= 0.45;
			earnMoney -= 13505;
		}
		return earnMoney;
	}
}
