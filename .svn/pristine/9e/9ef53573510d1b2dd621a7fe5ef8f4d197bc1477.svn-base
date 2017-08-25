package com.chinasofti.eec.day002.homework;

import java.util.Scanner;

public class Di_6_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入您的工资的税前金额：");
		double salary = scan.nextDouble();
		double taxIncome = salary - 3500;
		double tax;
		if (taxIncome <= 3500) {
			tax = 0;
		} else if (taxIncome <= 1500) {
			tax = taxIncome * 0.03;
		} else if (taxIncome <= 4500) {
			tax = taxIncome * 0.1 - 105;
		} else if (taxIncome <= 9000) {
			tax = taxIncome * 0.2 - 555;
		} else if (taxIncome <= 35000) {
			tax = taxIncome * 0.25 - 1005;
		} else if (taxIncome <= 55000) {
			tax = taxIncome * 0.3 - 2755;
		} else if (taxIncome <= 80000) {
			tax = taxIncome * 0.35 - 5505;
		} else {
			tax = taxIncome * 0.45 - 13505;
		}
		System.out.println("您应交" + tax + "元的个人所得税");
	}

}
